/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.controller;

import com.inmobiliaria.entity.Persona;
import com.inmobiliaria.repository.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fernando
 */
@RestController
@RequestMapping(path = "api/v1/Persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public List<Persona> listarPersona(){
     return personaService.listarPersona();
    }
    
}
