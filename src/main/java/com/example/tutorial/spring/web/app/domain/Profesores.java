package com.example.tutorial.spring.web.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

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
    @JoinColumn(name = "curso")
    private Cursos curso;

    @Column(name = "rut")
    private String rut;
    @Column(name = "foto")
    private String foto;

    @Column(name = "fecha_hoy")
    private Instant fechahoy;

    @Column(name = "fecha_final")
    private Instant fechafinal;

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

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Instant getFechahoy() {
        return fechahoy;
    }

    public void setFechahoy(Instant fechahoy) {
        this.fechahoy = fechahoy;
    }

    public Instant getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Instant fechafinal) {
        this.fechafinal = fechafinal;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", curso=" + curso +
                ", rut='" + rut + '\'' +
                ", foto='" + foto + '\'' +
                ", fechahoy=" + fechahoy +
                ", fechafinal=" + fechafinal +
                '}';
    }
}
