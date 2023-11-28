package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Servicio;
import com.german.tpintegrador.entity.TipoProblema;
import com.german.tpintegrador.repository.TipoProblemaRepo;

import java.util.List;

public class TipoProblemaServiceImp implements TipoProblemaService{
    private TipoProblemaRepo tipoProblemaRepo;
    @Override
    public TipoProblema saveTipoProblema(TipoProblema t) {
        return tipoProblemaRepo.save(t);
    }

    @Override
    public List<TipoProblema> getAllTipoProblema() {
        return tipoProblemaRepo.findAll();
    }

    @Override
    public TipoProblema updateTipoProblema(TipoProblema t, Long id) {
        TipoProblema tipoProblemaDB = tipoProblemaRepo.getReferenceById(id);

        if (!tipoProblemaDB.getNombre().trim().isEmpty())
            tipoProblemaDB.setNombre(tipoProblemaDB.getNombre());

        tipoProblemaDB.setTiempoEstimado(tipoProblemaDB.getTiempoEstimado());
        return tipoProblemaRepo.save(tipoProblemaDB);
    }

    @Override
    public void deleteTipoProblemaById(Long id) {

    }
}
