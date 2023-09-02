package com.example.demo.repositorio;

import com.example.demo.entidad.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends JpaRepository<Estadio,Integer> {

}

