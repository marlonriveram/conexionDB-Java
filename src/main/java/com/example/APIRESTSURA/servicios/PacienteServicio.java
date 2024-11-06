package com.example.APIRESTSURA.servicios;


// modelo crean las tablas
// lo repos hablan con las tablas
// los servicios hablan con los repositorios para implementar logica de negocio


import com.example.APIRESTSURA.modelos.Pacientes;
import com.example.APIRESTSURA.repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;

public class PacienteServicio {
    // para usar un servico debo llamsr al repositorio

    // INYECCION DE UNA DEPENDENCIA

    @Autowired // Permite instanciar clases sin tiener que hacer lo de new
    IRepositorioPaciente iRepositorioPaciente;

    //Listo las operaciones que voy a realizar en la base de datos

    // registrar un paciente
     public Pacientes registrarPaciente (Pacientes datospacientes){
         return  null;
     }
    // buscar los pacientes

    // buscar un paciente por id
}
