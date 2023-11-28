package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepo extends JpaRepository<Servicio,Long> {
}
