package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Rol;
import com.german.tpintegrador.entity.Servicio;
import com.german.tpintegrador.repository.ServicioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioServiceImp implements ServicioService{
    @Autowired
    private ServicioRepo servicioRepo;
    @Override
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
        servicioRepo.deleteById(id);

    }
    @Override
    public Servicio findServicioById(Long id){
        return servicioRepo.getReferenceById(id);
    }

}
