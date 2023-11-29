package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Tecnico;
import com.german.tpintegrador.repository.IncidenteRepo;
import com.german.tpintegrador.repository.TecnicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Date;
@Service
public class TecnicoServiceImp implements TecnicoService{
    @Autowired
    private TecnicoRepo tecnicoRepo;
    @Autowired
    private IncidenteRepo incidenteRepo;
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
    public Tecnico fetchTecnicoMasIncidentesResueltos(){
        return tecnicoRepo.findAll().stream()
                .max(Comparator.comparingInt(tecnico->cantIncidentesResueltosTecnico(tecnico)))
                .orElse(null);
    };
    @Override
    public int cantIncidentesResueltosTecnico(Tecnico tecnico){
        return (int) tecnico.getIncidentes().stream().filter(incidente->incidente.isResuelto()).count();
    };

    public Tecnico tecnicoMasIncidentesResueltos(){
        return tecnicoRepo.findAll().stream()
                //.max(Comparator.comparingInt(tecnico->cantIncidentesResueltosUltimosNdias(tecnico, ndias)))
                .max(Comparator.comparingInt(tecnico->incidenteRepo.findByTecnico_IdAndResuelto(tecnico.getId(),true).size()))
                .orElse(null);
    };
    /*@Override
    public int cantIncidentesResueltosUltimosNdias(Tecnico tecnico, int ndias){
        Date hoy = new Date();
        //resto ndias a la fecha actual
        //para restar ndias lo tengo que pasar a milisegundos
        long fechaLimite= hoy.getTime() - (ndias*24*60*60*1000L);
        return (int) tecnico.getIncidentes().stream()
                .filter((incidente -> incidenteRepo.findByIdAndFechaHastaAfter(incidente.getId(),new Date(fechaLimite)).isResuelto()))
                //.filter(incidente->incidente.isResuelto()&&incidente.getFechaHasta().getTime()>=fechaLimite)
                //.filter(incidente -> incidente.getFechaHasta().getTime()>=fechaLimite)
                .count();
    };*/
    @Override
    public void deleteTecnicoById(Long id) {

    }

    /*public Tecnico tecnicoMasIncidentesResueltosEspecialidad(String especialidad){
        return tecnicoRepo.findAll().stream()
                .max(Comparator.comparingInt(tecnico->
                        incidenteRepo.findByTecnico_IdAndAliasAndResueltoIsTrue((long) tecnico.getId(),especialidad).size()))
                .orElse(null);
    }*/
}
