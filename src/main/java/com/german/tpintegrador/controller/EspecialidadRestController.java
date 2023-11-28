package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EspecialidadRestController {
    @Autowired
    private EspecialidadService especialidadService;
}
