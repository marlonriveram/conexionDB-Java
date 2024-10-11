package com.example.APIRESTSURA.helpersvalidetor;

import com.example.APIRESTSURA.Utilis;
import com.example.APIRESTSURA.modelos.Pacientes;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validacionPaciente {

    //Inyeccion de dependencias llamar una clase dentro de otra
    Pacientes pacinete = new Pacientes();

    public Boolean validarNombre(String nombre){
        return Utilis.validarString("^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$",nombre);
    }

    public Boolean validarFechaNacimiento(LocalDate fecha){
        return fecha.getYear() >= 1920 && fecha.getYear() <= 2024;
    }

    public  Boolean validarCiudad (String ciudad){
        return Utilis.validarString("^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$",ciudad);
    }

    public  Boolean validarCorreo (String correo){
        return Utilis.validarString("^[a-zA-Z0-9._%+-]+@sura\\.com\\.co$",correo);
    }

    public  Boolean validarTelefono ( String telefono){
        return telefono.length() <= 10;
    }

    public Boolean validarGrupoIngreso(String grupoIngreso){
        return grupoIngreso.toUpperCase().equals("A") || grupoIngreso.toUpperCase().equals("B") || grupoIngreso.toUpperCase().equals("C");
    }

    public Boolean validarFechaAfiliacion (LocalDate fecha){
        return fecha.getYear() >= 1995 && fecha.getYear() <= 2024;
    }
}
