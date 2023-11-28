package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidenteRepo extends JpaRepository<Incidente,Long> {
}
