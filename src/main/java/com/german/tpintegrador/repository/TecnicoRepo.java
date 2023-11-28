package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepo extends JpaRepository<Tecnico,Long> {
}
