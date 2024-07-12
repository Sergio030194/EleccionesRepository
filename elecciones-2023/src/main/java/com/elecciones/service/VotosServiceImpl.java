package com.elecciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elecciones.model.Votos;
import com.elecciones.repo.IVotosRepo;

@Service
public class VotosServiceImpl {
	
	@Autowired
	private IVotosRepo repo;
	
	//Valida si existe un registro para no duplicar los votos
	public List<String> validarVotos(String comunidad, String seccion, String casilla, String partido) {
		return repo.validarVotos(comunidad, seccion, casilla, partido);
	}
	
	//Se guardan los votos
	public Votos saveVotos(Votos votos){
		return repo.save(votos);
	}
	
	//Se consulta el total de votos por partido
	public List<String> getVotosPartido(){
		return repo.getVotosPartido();
	}

}
