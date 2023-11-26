package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente,Long> {
}
