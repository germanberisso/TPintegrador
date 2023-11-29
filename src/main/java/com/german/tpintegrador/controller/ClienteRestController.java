package com.german.tpintegrador.controller;

import com.german.tpintegrador.entity.Cliente;
import com.german.tpintegrador.entity.Servicio;
import com.german.tpintegrador.service.ClienteService;
import com.german.tpintegrador.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class ClienteRestController {
        @Autowired
        private ClienteService clienteService;
        @Autowired
        private ServicioService servicioService;

        // Create
        @PostMapping("/clienteSave")
        public Cliente saveCliente(@Validated @RequestBody Map<String, Object> body){

                //LECTURA DE DATOS:
                String cuit = String.valueOf(body.get("cuit"));
                String razonSocial = String.valueOf(body.get("razon social"));
                String mail = String.valueOf(body.get("mail"));

                //CREACION DEL OBJETO CLIENTE
                Cliente c = new Cliente();
                c.setRazonSocial(razonSocial);
                c.setCuit(cuit);
                c.setMail(mail);

                return clienteService.saveCliente(c);
        }

        // Read
        @GetMapping("/clienteList")
        public List<Cliente> fetchClienteList(){
                return clienteService.getAllClientes();
        }

        // Update
        @PutMapping("/personas/{id}")
        public Cliente updatePersona(@Validated @RequestBody Map<String, Object> body, @PathVariable("id") Long id){
                //CREACION DEL OBJETO CLIENTE
                Cliente c = new Cliente();
                //LECTURA DE DATOS:

                if(body.get("razon social") != null) {
                        String razonSocial = String.valueOf(body.get("razon social"));
                        c.setRazonSocial(razonSocial);
                }
                if(body.get("cuit") != null) {
                        String cuit = String.valueOf(body.get("cuit"));
                        c.setCuit(cuit);
                }
                if(body.get("mail") != null) {
                        String mail = String.valueOf(body.get("mail"));
                        c.setRazonSocial(mail);
                }



                //Servicios
                Set<Servicio> s = new HashSet<Servicio>();
                if(body.get("servicio") != null) {
                        for (Integer servicioId : (ArrayList<Integer>) body.get("servicio")) {
                                Servicio servicio = servicioService.findServicioById(Long.valueOf(servicioId));
                                s.add(servicio);
                        }
                }
                c.setServicios(s);
                return clienteService.updateCliente(c, id);
        }

        // Delete
        @DeleteMapping("/personas/{id}")
        public String deletePersonaById(@PathVariable("id") Long id){
                clienteService.deleteClienteById(id);
                return "Eliminado correctamente";
        }
}
