package com.elecciones.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elecciones.model.Candidatos;

@Repository
public interface ICandidatosRepo extends JpaRepository<Candidatos, Integer> {
	
	@Query(value = "SELECT partido FROM candidatos", nativeQuery = true)
	List<String> consultarPartidos();

}
