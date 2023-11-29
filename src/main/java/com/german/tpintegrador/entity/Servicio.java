package com.german.tpintegrador.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int servicio_id;
    @Column
    private String nombre;

}
