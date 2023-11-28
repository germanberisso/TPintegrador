package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Especialidad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EspecialidadService {
    // Create
    Especialidad saveEspecialidad(Especialidad e);

    // Read
    List<Especialidad> getAllEspecialidad();

    // Update
    Especialidad updateEspecialidad(Especialidad e, Long id);

    // Delete
    void deleteEspecialidadById(Long id);
}
