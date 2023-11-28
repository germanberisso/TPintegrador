package com.german.tpintegrador.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 255)
    private String alias;
    @Column
    private Date fechaEstimada;
    @Column
    private Date fechaDesde;
    @Column
    private Date fechaHasta;
    @Column
    private boolean resuelto;
    @Column
    private String consideracion;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Cliente cliente;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Tecnico tecnico;
    @PrimaryKeyJoinColumn
    @OneToOne
    private TipoProblema tipo;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Servicio servicio;
}
