package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RolService {
    // Create
    Rol saveRol(Rol r);

    // Read
    List<Rol> getAllRol();

    // Update
    Rol updateRol(Rol r, Long id);

    // Delete
    void deleteRolById(Long id);
}
