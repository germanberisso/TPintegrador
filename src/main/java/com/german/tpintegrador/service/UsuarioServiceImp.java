package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Usuario;
import com.german.tpintegrador.repository.UsuarioRepo;

import java.util.List;

public class UsuarioServiceImp implements UsuarioService{
    private UsuarioRepo usuarioRepo;
    public Usuario saveUsuario(Usuario u) {
        return usuarioRepo.save(u);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario updateUsuario(Usuario u, Long id) {
        Usuario usuarioDB = usuarioRepo.getReferenceById(id);
        if (!usuarioDB.getNombre().trim().isEmpty())
            usuarioDB.setNombre(usuarioDB.getNombre());
        if (!usuarioDB.getPassword().trim().isEmpty())
            usuarioDB.setPassword(usuarioDB.getPassword());
        if (usuarioDB.getRol() != null)
            usuarioDB.setRol(usuarioDB.getRol());
        return usuarioRepo.save(usuarioDB);
    }

    @Override
    public void deleteUsuarioById(Long id) {

    }
}
