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
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 255)
    private String razonSocial;
    @Column(nullable = false, length = 20)
    private String cuit;
    @Column(nullable = false, length = 255)
    private String mail;
    @OneToMany
    private ArrayList<Servicio> servicios;


}
