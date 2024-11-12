package com.example.APIRESTSURA.controllers;

import com.example.APIRESTSURA.modelos.SignoVital;
import com.example.APIRESTSURA.servicios.SignoVitalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signosvitales")
public class SignosVitales {
    @Autowired
    SignoVitalServicio signoVitalServicio;

    @PatchMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital dato){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(signoVitalServicio.registrarSignoVital(dato));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
