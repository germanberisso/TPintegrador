package com.german.tpintegrador.controller;

import com.german.tpintegrador.entity.TipoProblema;
import com.german.tpintegrador.service.TipoProblemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoProblemaRestController {
    @Autowired
    private TipoProblemaService tipoProblemaService;
}
