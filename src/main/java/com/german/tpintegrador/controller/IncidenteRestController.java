package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.IncidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncidenteRestController {
    @Autowired
    private IncidenteService incidenteService;
}
