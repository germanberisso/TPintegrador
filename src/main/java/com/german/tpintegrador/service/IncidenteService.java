package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Incidente;
import com.german.tpintegrador.entity.Tecnico;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IncidenteService {
    // Create
    Incidente saveIncidente(Incidente i);

    // Read
    List<Incidente> getAllIncidente();

    // Update
    Incidente updateIncidente(Incidente i, Long id);

    // Delete
    void deleteIncidenteById(Long id);

    //Tecnico findTecnicoMasIncidentesResueltosByEsp(String especialidad);

}
