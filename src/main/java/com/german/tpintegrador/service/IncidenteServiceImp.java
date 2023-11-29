package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Incidente;
import com.german.tpintegrador.entity.Tecnico;
import com.german.tpintegrador.repository.IncidenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncidenteServiceImp implements IncidenteService{
    @Autowired
    private IncidenteRepo incidenteRepo;
    public Incidente saveIncidente(Incidente i) {
        return incidenteRepo.save(i);
    }

    public List<Incidente> getAllIncidente() {
        return incidenteRepo.findAll();
    }

    public Incidente updateIncidente(Incidente incidente, Long id) {
        Incidente incidenteDB = incidenteRepo.getReferenceById(id);
        if(!incidente.getAlias().trim().isEmpty())
            incidenteDB.setAlias(incidente.getAlias());
        if(incidente.getCliente() != null)
            incidenteDB.setCliente(incidente.getCliente());
        if(incidente.getConsideracion() !=null)
            incidenteDB.setConsideracion(incidente.getConsideracion());
        incidenteDB.setResuelto(incidente.isResuelto());
        if(incidente.getTipo() != null)
            incidenteDB.setTipo(incidente.getTipo());
        if(incidente.getTecnico() != null)
            incidenteDB.setTecnico(incidente.getTecnico());
        if(incidente.getFechaEstimada() != null)
            incidenteDB.setFechaEstimada(incidente.getFechaEstimada());
        if(incidente.getFechaDesde() != null)
            incidenteDB.setFechaDesde(incidente.getFechaDesde());
        if(incidente.getFechaHasta() != null)
            incidenteDB.setFechaHasta(incidente.getFechaHasta());
        if(incidente.getServicio() != null)
            incidenteDB.setServicio(incidente.getServicio());

        return incidenteRepo.save(incidenteDB);
    }
    @Override
    public void deleteIncidenteById(Long id) {

    }
    //public Tecnico findTecnicoMasIncidentesResueltosByEsp(String especialidad){
    //     List<Incidente> list =  incidenteRepo.findByResueltoTrueAndServicio_Nombre(especialidad);
    //}

}
