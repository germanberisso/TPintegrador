package com.german.tpintegrador.controller;

import com.german.tpintegrador.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolRestController {
    @Autowired
    private RolService rolService;
}
