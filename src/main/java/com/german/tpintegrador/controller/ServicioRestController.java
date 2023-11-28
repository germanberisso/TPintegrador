package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioRestController {
    @Autowired
    private ServicioService servicioService;
}
