package com.example.demo.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "arbitro")
@Getter
@Setter
public class Arbitro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idarbitro;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "pais",nullable = false)
    private String pais;


}

