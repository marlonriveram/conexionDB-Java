package com.example.APIRESTSURA.controllers;

import com.example.APIRESTSURA.modelos.Pacientes;
import com.example.APIRESTSURA.servicios.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paciente") // url
public class PacienteControlador {
    @Autowired // instanicar clase sin usar new
    PacienteServicio pacienteServicio;

    @PostMapping //se pone ? por que no se sabe que va a llegar
    public ResponseEntity<?> guardar (@RequestBody Pacientes datos) throws Exception{
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(pacienteServicio.registrarPaciente(datos));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }

    }
}
