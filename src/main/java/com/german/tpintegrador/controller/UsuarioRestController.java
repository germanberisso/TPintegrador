package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;
}
