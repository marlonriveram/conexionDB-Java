package com.example.APIRESTSURA.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // permite mapear la classe y combertirla en una tabla de la base de datos
@Table(name = "Pacientes") // sera el nombre de la tabla en la base de datos
public class Pacientes {
    @Id // id de la tabla en la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Hace que el id sea auto incremental
    private Long id;
    private String nombre; // no debe tener mas de 40 caracteres - solo admite letra
    private LocalDate anioNacimiento; // el año no puede ser mayor a 2024 - no puede ser menor a 1920
    private String ciudad; // no debe tener mas de 50 caracteres - solo debe tener letras
    private String correo; // debe tener formato @sura.com.co
    private String telefono; // el telefono debe tener 10 digitos
    private String ips;
    private Boolean tienePoliza;
    private String grupoIngreso;// debe ser a,b o c
    private LocalDate fechaAfiliacion; // validad entre 1995

    public Pacientes() {
    }

    public Pacientes(Long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, Boolean tienePoliza, String grupoIngreso, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.grupoIngreso = grupoIngreso;
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public String getGrupoIngreso() {
        return grupoIngreso;
    }

    public void setGrupoIngreso(String grupoIngreso) {
        this.grupoIngreso = grupoIngreso;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
}
