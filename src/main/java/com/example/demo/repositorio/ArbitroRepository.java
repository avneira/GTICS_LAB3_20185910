package com.example.demo.repositorio;
import com.example.demo.entidad.Arbitro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArbitroRepository extends JpaRepository<Arbitro, Integer>{
}
