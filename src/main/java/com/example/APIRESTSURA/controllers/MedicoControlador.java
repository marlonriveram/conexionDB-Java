package com.example.APIRESTSURA.controllers;

import com.example.APIRESTSURA.modelos.Medico;
import com.example.APIRESTSURA.servicios.MedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medico")
public class MedicoControlador {
    @Autowired
    MedicoServicio medicoServicio;

    @PostMapping
    public ResponseEntity<?> guardar (@RequestBody Medico dato) throws Exception{
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(medicoServicio.registrarMedico(dato));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
