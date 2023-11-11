/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.repository;

import com.inmobiliaria.entity.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fernando
 */
@Service
public class PersonaService {

    @Autowired
    PersonaRepo personaRepo;

    public List<Persona> listarPersona() {
        return personaRepo.findAll();
    }

    public Optional<Persona> getPersona(int id) {
        return personaRepo.findById(id);
    }
    public void saveOrUpdate(Persona persona){
    personaRepo.save(persona);
    }
    
    public void delete(int id){
    personaRepo.deleteById(id);
    
    
    }
}
