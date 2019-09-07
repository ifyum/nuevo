package com.example.tutorial.spring.web.app.domain;

import javax.persistence.*;

@Entity
@Table(name="Profesores")
public class Profesores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nombre")
    private  String nombre;

    @Column (name="apellido")
    private String apellido;

    @Column(name = "rut")
    private String rut;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}
