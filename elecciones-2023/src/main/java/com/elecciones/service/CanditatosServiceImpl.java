package com.elecciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elecciones.model.Candidatos;
import com.elecciones.repo.ICandidatosRepo;

@Service
public class CanditatosServiceImpl {
	
	@Autowired
	private ICandidatosRepo repo;

	
	public List<Candidatos> consultarCandidatos() {
	
		return repo.findAll();
	}
	
	//Consulta los diferentes partidos politicos
	public List<String> consultarPartidos(){
		return repo.consultarPartidos();
	}

}
