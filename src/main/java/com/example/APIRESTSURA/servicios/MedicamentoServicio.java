package com.example.APIRESTSURA.servicios;

import com.example.APIRESTSURA.modelos.Medicamento;
import com.example.APIRESTSURA.modelos.Medico;
import com.example.APIRESTSURA.repositorios.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServicio {
    // para usar un servico debo llamsr al repositorio

    // INYECCION DE UNA DEPENDENCIA
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    //Listo las operaciones que voy a realizar en la base de datos

    // registrar un paciente
    public Medicamento registrarMedicamneto (Medicamento datosMedicamento) throws Exception{
        try{
            // Guardar en bd los datos paciente
            return iRepositorioMedicamento.save(datosMedicamento);
        }catch (Exception error){
            throw new Exception (error.getMessage());
        }
    }
    // buscar los pacientes

    // buscar un paciente por id

}
