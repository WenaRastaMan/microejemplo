package com.microservicio.actividad.microejemplo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MicroEjemploController {

    @GetMapping("/hola")
    public String microejemplo() {
        return "microejemplo";
    }
    
}
