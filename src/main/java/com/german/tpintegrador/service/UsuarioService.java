package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UsuarioService {
    // Create
    Usuario saveUsuario(Usuario u);

    // Read
    List<Usuario> getAllUsuario();

    // Update
    Usuario updateUsuario(Usuario u, Long id);

    // Delete
    void deleteUsuarioById(Long id);
}
