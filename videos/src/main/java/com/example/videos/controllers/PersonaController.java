package com.example.videos.controllers;

import com.example.videos.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController {
    private PersonaService personaService;

    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
        }catch (Exception e){
           return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. por favor intente mas tarde.\"}");
        }
    }
}
