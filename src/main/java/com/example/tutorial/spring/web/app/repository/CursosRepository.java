package com.example.tutorial.spring.web.app.repository;

import com.example.tutorial.spring.web.app.domain.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
}
