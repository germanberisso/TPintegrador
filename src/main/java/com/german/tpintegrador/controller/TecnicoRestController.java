package com.german.tpintegrador.controller;

import com.german.tpintegrador.entity.Cliente;
import com.german.tpintegrador.entity.Tecnico;
import com.german.tpintegrador.repository.IncidenteRepo;
import com.german.tpintegrador.service.EspecialidadService;
import com.german.tpintegrador.service.IncidenteService;
import com.german.tpintegrador.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/masIncidentesResueltos")
    public Tecnico fetchTecnicoMasIncidentesResueltos(){
        return tecnicoService.fetchTecnicoMasIncidentesResueltos();
    }

    //para probar este endpoint, debo pasar el parametro ndias, para eso en el navegador por ejemplo:
    //http://localhost:8080/masIncidentesResueltosNdias?ndias=800
    /*@GetMapping("/masIncidentesResueltosNdias")
    public Tecnico tecnicoMasIncidentesResueltosNdias(@RequestParam String ndias){
        return tecnicoService.tecnicoMasIncidentesResueltosNdias(Integer.parseInt(ndias));
    }*/
    /*@GetMapping("tecnicomasIncidentesResueltosEspecialidad")
    public Tecnico tecnicomasIncidentesResueltosEspecialidad(@RequestParam String especialidad){
        return tecnicoService.tecnicoMasIncidentesResueltosEspecialidad(especialidad);
    }*/
    @GetMapping("fn")
    public Tecnico masIncidentesResueltos(){
        return tecnicoService.tecnicoMasIncidentesResueltos();
    }



}
