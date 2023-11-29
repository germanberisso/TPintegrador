package com.german.tpintegrador.repository;

import com.german.tpintegrador.entity.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncidenteRepo extends JpaRepository<Incidente,Long> {

    List<Incidente> findByResueltoTrue();

    List<Incidente> findByServicio_Nombre(String nombre);

    List<Incidente> findByResueltoTrueAndServicio_Nombre(String nombre);

    //Incidente findByIdAndFechaHastaAfterAndResuelto(Long id, Date fecha);

    List<Incidente> findByTecnico_IdAndResuelto(int id, boolean b);

    List<Incidente> findByTecnico_IdAndResueltoIsTrue(int id);

    //List<Incidente> findByTecnico_IdAndServicio_NombreAndResueltoIsTrue(Long id, String servicio_nombre);
}
