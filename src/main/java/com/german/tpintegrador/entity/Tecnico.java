package com.german.tpintegrador.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 255)
    private String nombre;
    @Column(nullable = false, length = 255)
    private String mail;
    @Column(nullable = false, length = 20)
    private String telefono;
    @OneToMany
    private ArrayList<Especialidad> especialidades;
    @OneToMany
    private ArrayList<Incidente> incidentes;

}
