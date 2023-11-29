package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Usuario;
import com.german.tpintegrador.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImp implements UsuarioService{
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Override
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
