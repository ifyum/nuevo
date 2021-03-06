package com.example.tutorial.spring.web.app.domain;


import com.example.tutorial.spring.web.app.domain.enumeration.CursosEnum;
import com.example.tutorial.spring.web.app.domain.enumeration.LetrasEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "Cursos")

public class Cursos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sala")
    private Long Sala;


    @JoinColumn(name = "profesor_jefe_id")
    @ManyToOne
    private Profesores profesor;

    @Column(name = "cantidad_alumnos")
    private Integer cantidadAlumnos;

    @Enumerated(EnumType.STRING)
    @Column(name = "letra")
    private LetrasEnum letra;

    @Enumerated(EnumType.STRING)
    @Column(name = "Curso")
    private CursosEnum Curso;

    public Cursos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSala() {
        return Sala;
    }

    public void setSala(Long sala) {
        Sala = sala;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public LetrasEnum getLetra() {
        return letra;
    }

    public void setLetra(LetrasEnum letra) {
        this.letra = letra;
    }

    public CursosEnum getCurso() {
        return Curso;
    }

    public void setCurso(CursosEnum curso) {
        Curso = curso;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "id=" + id +
                ", Sala=" + Sala +
                ", profesor=" + profesor +
                ", cantidadAlumnos=" + cantidadAlumnos +
                ", letra=" + letra +
                ", Curso=" + Curso +
                '}';
    }
}
