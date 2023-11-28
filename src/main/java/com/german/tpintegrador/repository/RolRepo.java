package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepo extends JpaRepository<Rol,Long> {
}
