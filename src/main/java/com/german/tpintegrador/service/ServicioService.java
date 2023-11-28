package com.german.tpintegrador.service;


import com.german.tpintegrador.entity.Servicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServicioService {
    // Create
    Servicio saveServicio(Servicio s);

    // Read
    List<Servicio> getAllServicio();

    // Update
    Servicio updateServicio(Servicio s, Long id);

    // Delete
    void deleteServicioById(Long id);

    Servicio findServicioById(Long id);
}
