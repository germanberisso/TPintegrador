package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Cliente;
import com.german.tpintegrador.entity.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepo extends JpaRepository<Especialidad,Long> {
}
