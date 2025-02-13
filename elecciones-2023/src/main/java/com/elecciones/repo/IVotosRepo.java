package com.elecciones.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elecciones.model.Votos;

@Repository
public interface IVotosRepo extends JpaRepository<Votos, Integer> {
	
	@Query(value = "SELECT votos FROM votos WHERE comunidad = ?1 and seccion = ?2 and "
			+ "casilla = ?3 and partido = ?4", nativeQuery = true)
	List<String> validarVotos(String comunidad, String seccion, String casilla, String partido);
	
	@Query(value = "SELECT SUM(votos) AS votos FROM votos GROUP BY partido", nativeQuery = true)
	List<String> getVotosPartido();
	


}
