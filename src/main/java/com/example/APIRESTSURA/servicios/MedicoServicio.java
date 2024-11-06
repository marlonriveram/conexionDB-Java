package com.example.APIRESTSURA.servicios;

import com.example.APIRESTSURA.modelos.Medico;
import com.example.APIRESTSURA.modelos.Pacientes;
import com.example.APIRESTSURA.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicoServicio {
    @Autowired

    // para usar un servico debo llamsr al repositorio

    // INYECCION DE UNA DEPENDENCIA

    IRepositorioMedico repositorioMedico;

    //Listo las operaciones que voy a realizar en la base de datos

    // registrar un paciente
    public Medico registrarMedico (Medico datosMedico){
        return  null;
    }
    // buscar los pacientes

    // buscar un paciente por id

}
