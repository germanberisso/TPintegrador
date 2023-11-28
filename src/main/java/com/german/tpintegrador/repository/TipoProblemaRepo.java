package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.TipoProblema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProblemaRepo extends JpaRepository<TipoProblema,Long> {
}
