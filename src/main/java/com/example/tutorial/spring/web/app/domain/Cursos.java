package com.example.tutorial.spring.web.app.domain;


import com.example.tutorial.spring.web.app.domain.enumeration.CursosEnum;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Cursos")

public class Cursos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "Sala")
    private Long Sala;

    @Column(name = "Profesor_Jefe")
    private String profesorJefe;

    @Column(name = "Cantidad_Alumnos")
    private Long cantidadAlumnos;

    @Enumerated(EnumType.STRING)
    @Column(name = "Cursos")
    private CursosEnum curso;

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

    public CursosEnum getCurso() {
        return curso;
    }

    public void setCurso(CursosEnum curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "Cursos{" +
                "id=" + id +
                ", Sala=" + Sala +
                ", profesorJefe='" + profesorJefe + '\'' +
                ", cantidadAlumnos=" + cantidadAlumnos +
                ", curso=" + curso +
                '}';
    }
}
