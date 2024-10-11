package com.example.APIRESTSURA.modelos;

import jakarta.persistence.*;

import javax.swing.text.StyledEditorKit;

@Entity
@Table(name = "Midicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String matricula;
    private String especialidad;
    private Integer salario;
    private String ips;
    private String correo;
    private String telefono;
    private String direccion;
    private Boolean estadisponibleFinDeSemana;

    public Medico() {
    }

    public Medico(Long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean estadisponibleFinDeSemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadisponibleFinDeSemana = estadisponibleFinDeSemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstadisponibleFinDeSemana() {
        return estadisponibleFinDeSemana;
    }

    public void setEstadisponibleFinDeSemana(Boolean estadisponibleFinDeSemana) {
        this.estadisponibleFinDeSemana = estadisponibleFinDeSemana;
    }
}
