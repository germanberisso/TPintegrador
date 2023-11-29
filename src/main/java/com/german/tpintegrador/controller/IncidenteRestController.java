package com.german.tpintegrador.controller;

import com.german.tpintegrador.entity.Incidente;
import com.german.tpintegrador.entity.Tecnico;
import com.german.tpintegrador.service.IncidenteService;
import com.german.tpintegrador.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IncidenteRestController {
    @Autowired
    private IncidenteService incidenteService;
    @Autowired
    private TecnicoService tecnicoService;

    /*@GetMapping("/tecnicoMasIncidentesResueltosEspecialidad")
    public Tecnico tecnicoMasIncidentesResueltosEspecialidad(@RequestParam String especialidad){
        return incidenteService.findTecnicoMasIncidentesResueltosByEsp(especialidad);
    }*/
}
