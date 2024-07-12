package com.elecciones.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elecciones.model.Secciones;

@Repository
public interface ISeccionesRepo extends JpaRepository<Secciones, Integer> {
	
	@Query(value = "SELECT distinct comunidad FROM secciones",nativeQuery = true)
	List<String> consultarComunidades();
	
	@Query(value = "SELECT distinct nombre FROM secciones WHERE comunidad = ?1", nativeQuery = true)
	List<String> consultarSecciones(String comunidad);
	
	@Query(value = "SELECT distinct casilla FROM secciones WHERE nombre = ?1", nativeQuery = true)
	List<String> consultarCasillas(String seccion);

}
