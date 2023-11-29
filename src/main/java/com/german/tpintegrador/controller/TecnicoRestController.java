package com.german.tpintegrador.controller;

import com.german.tpintegrador.entity.Cliente;
import com.german.tpintegrador.entity.Tecnico;
import com.german.tpintegrador.service.EspecialidadService;
import com.german.tpintegrador.service.IncidenteService;
import com.german.tpintegrador.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TecnicoRestController {
    @Autowired
    private TecnicoService tecnicoService;
    @Autowired
    private IncidenteService incidenteService;
    @Autowired
    private EspecialidadService especialidadService;
    @GetMapping("/masIncidentes")
    public Tecnico fetchTecnicoMasIncidentes(){
        return tecnicoService.fetchTecnicoMasIncidentes();
    }

}
