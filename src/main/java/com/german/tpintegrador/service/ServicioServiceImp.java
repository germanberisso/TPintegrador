package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Rol;
import com.german.tpintegrador.entity.Servicio;
import com.german.tpintegrador.repository.ServicioRepo;

import java.util.List;

public class ServicioServiceImp implements ServicioService{
    private ServicioRepo servicioRepo;

    public Servicio saveServicio(Servicio s) {
        return servicioRepo.save(s);
    }

    @Override
    public List<Servicio> getAllServicio() {
        return servicioRepo.findAll();
    }

    @Override
    public Servicio updateServicio(Servicio s, Long id) {
        Servicio servicioDB = servicioRepo.getReferenceById(id);

        if (!servicioDB.getNombre().trim().isEmpty())
            servicioDB.setNombre(servicioDB.getNombre());;
        return servicioRepo.save(servicioDB);
    }

    @Override
    public void deleteServicioById(Long id) {

    }
}
