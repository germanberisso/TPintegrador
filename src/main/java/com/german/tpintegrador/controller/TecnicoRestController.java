package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TecnicoRestController {
    @Autowired
    private TecnicoService tecnicoService;
}
