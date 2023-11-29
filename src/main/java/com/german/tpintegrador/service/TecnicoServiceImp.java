package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Tecnico;
import com.german.tpintegrador.repository.TecnicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
@Service
public class TecnicoServiceImp implements TecnicoService{
    @Autowired
    private TecnicoRepo tecnicoRepo;
    @Autowired
    private IncidenteService incidenteService;
    @Override
    public Tecnico saveTecnico(Tecnico t) {
        return tecnicoRepo.save(t);
    }

    @Override
    public List<Tecnico> getAllTecnico() {
        return tecnicoRepo.findAll();
    }

    @Override
    public Tecnico updateTecnico(Tecnico t, Long id) {
        Tecnico tecnicoDB = tecnicoRepo.getReferenceById(id);
        if (!tecnicoDB.getNombre().trim().isEmpty())
            tecnicoDB.setNombre(tecnicoDB.getNombre());
        if (!tecnicoDB.getMail().trim().isEmpty())
            tecnicoDB.setMail(tecnicoDB.getMail());
        if (!tecnicoDB.getTelefono().trim().isEmpty())
            tecnicoDB.setTelefono(tecnicoDB.getTelefono());
        if(tecnicoDB.getEspecialidades() != null)
            tecnicoDB.setEspecialidades(tecnicoDB.getEspecialidades());
        if(tecnicoDB.getIncidentes() != null)
            tecnicoDB.setIncidentes(tecnicoDB.getIncidentes());
        return tecnicoRepo.save(tecnicoDB);
    }
    @Override
    public Tecnico fetchTecnicoMasIncidentes(){
        return tecnicoRepo.findAll().stream()
                .max(Comparator.comparingInt(tecnico->(int)tecnico.getIncidentes().size()))
                .orElse(null);
    };


    @Override
    public void deleteTecnicoById(Long id) {

    }
}
