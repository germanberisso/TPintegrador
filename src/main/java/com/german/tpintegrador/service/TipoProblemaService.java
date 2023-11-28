package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.TipoProblema;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TipoProblemaService {
    // Create
    TipoProblema saveTipoProblema(TipoProblema t);

    // Read
    List<TipoProblema> getAllTipoProblema();

    // Update
    TipoProblema updateTipoProblema(TipoProblema t, Long id);

    // Delete
    void deleteTipoProblemaById(Long id);
}
