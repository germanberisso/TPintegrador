package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClienteRestController {
        @Autowired
        private ClienteService clienteService;
}
