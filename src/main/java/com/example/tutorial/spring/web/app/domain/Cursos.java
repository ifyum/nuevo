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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "sala")
    private Long Sala;

    @Column(name = "profesor_jefe")
    private String profesorJefe;

    @JoinColumn(name = "profesor_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Profesores profesor;

    @Column(name = "cantidad_alumnos")
    private Long cantidadAlumnos;

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

    public String getProfesorJefe() {
        return profesorJefe;
    }

    public void setProfesorJefe(String profesorJefe) {
        this.profesorJefe = profesorJefe;
    }

    public Long getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Long cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }


    public void setCurso(CursosEnum curso) {
        this.letra = letra;
    }

    public void getCurso(CursosEnum curso) {
        this.letra = letra;
    }

    public LetrasEnum getLetra() {
        return letra;
    }

    public void setLetra(LetrasEnum letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "id=" + id +
                ", Sala=" + Sala +
                ", profesorJefe='" + profesorJefe + '\'' +
                ", profesor=" + profesor +
                ", cantidadAlumnos=" + cantidadAlumnos +
                ", letra=" + letra +
                ", Curso=" + Curso +
                '}';
    }
}
