package com.example.tutorial.spring.web.app.repository;


import com.example.tutorial.spring.web.app.domain.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesoresRepository extends JpaRepository<Profesores, Long> {
}
