package com.example.APIRESTSURA.controllers;

import com.example.APIRESTSURA.modelos.Medicamento;
import com.example.APIRESTSURA.servicios.MedicamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoControlador {
    @Autowired
    MedicamentoServicio medicamentoServicio;

    @PostMapping
    public ResponseEntity<?> guardar (@RequestBody Medicamento dato) throws Exception{
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(medicamentoServicio.registrarMedicamneto(dato));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
