package com.example.tutorial.spring.web.app.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Profesores")
public class Profesores implements Serializable {

    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private  String nombre;

    @Column (name="apellido")
    private String apellido;


    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Cursos CursoId;

    @Column(name = "rut")
    private String rut;

//mierda muy importante
    public Profesores() {
    }
    //
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

    public Cursos getCursoId() {
        return CursoId;
    }

    public void setCursoId(Cursos cursoId) {
        CursoId = cursoId;
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
