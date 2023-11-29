package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Especialidad;
import com.german.tpintegrador.repository.EspecialidadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadServiceImp implements EspecialidadService{
    @Autowired
    private EspecialidadRepo especialidadRepo;
    @Override
    public Especialidad saveEspecialidad(Especialidad e) {
        return especialidadRepo.save(e);
    }
    @Override
    public List<Especialidad> getAllEspecialidad() {
        return especialidadRepo.findAll();
    }
    @Override
    public Especialidad updateEspecialidad(Especialidad especialidad, Long id) {
        Especialidad especialidadDB = especialidadRepo.getReferenceById(id);
        if(!especialidad.getNombre().trim().isEmpty())
            especialidadDB.setNombre(especialidad.getNombre());

        return especialidadRepo.save(especialidadDB);
    }
    @Override
    public void deleteEspecialidadById(Long id) {

    }
}
