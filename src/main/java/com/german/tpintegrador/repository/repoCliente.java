package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repoCliente extends JpaRepository<Cliente,Long> {
}
