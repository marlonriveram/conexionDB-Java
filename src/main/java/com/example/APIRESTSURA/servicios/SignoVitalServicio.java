package com.example.APIRESTSURA.servicios;

import com.example.APIRESTSURA.modelos.Medico;
import com.example.APIRESTSURA.modelos.SignoVital;
import com.example.APIRESTSURA.repositorios.IRepositorioSignovital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignoVitalServicio {
    // para usar un servico debo llamsr al repositorio

    // INYECCION DE UNA DEPENDENCIA
    @Autowired
    IRepositorioSignovital repositorioSignovital;

    //Listo las operaciones que voy a realizar en la base de datos

    // registrar un paciente
    public SignoVital registrarSignoVital (SignoVital datosSignoVital)throws Exception{
        try{
            // Guardar en bd los datos paciente
            return repositorioSignovital.save(datosSignoVital);
        }catch (Exception error){
            throw new Exception (error.getMessage());
        }
    }
    // buscar los pacientes

    // buscar un paciente por id
}
