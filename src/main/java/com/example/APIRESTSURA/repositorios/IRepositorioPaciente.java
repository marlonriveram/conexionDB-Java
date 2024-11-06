package com.example.APIRESTSURA.repositorios;

import com.example.APIRESTSURA.modelos.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository es el convertidor de java a sql y viceversa
// se extiende JpaRepository <la tabla a la que vamosa usar,tipo de dato del id de la tabla
public interface IRepositorioPaciente extends JpaRepository<Pacientes,Long> {

}