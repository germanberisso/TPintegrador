package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Rol;
import com.german.tpintegrador.repository.RolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImp implements RolService{
    @Autowired
    private RolRepo rolRepo;
    public Rol saveRol(Rol r) {
        return rolRepo.save(r);
    }

    public List<Rol> getAllRol() {
        return rolRepo.findAll();
    }

    public Rol updateRol(Rol rol, Long id) {
        Rol rolDB = rolRepo.getReferenceById(id);

        if (!rolDB.getRolNombre().trim().isEmpty())
            rolDB.setRolNombre(rolDB.getRolNombre());;
        return rolRepo.save(rolDB);
    }
    @Override
    public void deleteRolById(Long id) {

    }

}
