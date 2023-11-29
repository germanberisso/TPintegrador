package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Tecnico;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TecnicoService {
    // Create
    Tecnico saveTecnico(Tecnico t);

    // Read
    List<Tecnico> getAllTecnico();

    // Update
    Tecnico updateTecnico(Tecnico t, Long id);

    // Delete
    void deleteTecnicoById(Long id);

    Tecnico fetchTecnicoMasIncidentes();
    Tecnico fetchTecnicoMasIncidentesResueltos();
    int cantIncidentesResueltosTecnico(Tecnico tecnico);
    Tecnico tecnicoMasIncidentesResueltos();
    //Tecnico tecnicoMasIncidentesResueltosNdias(int ndias);
    //Tecnico tecnicoMasIncidentesResueltosEspecialidad(String especialidad);
}
