package com.elecciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elecciones.repo.ISeccionesRepo;

@Service
public class SeccionesServiceImpl {
	
	@Autowired
	private ISeccionesRepo repo;
	
	//Consulta las diferentes comunidades 
	public List<String> consultarComunidades(){
		return repo.consultarComunidades();
	}
	
	//Consulta las secciones de acuerdo a la comunidad
	public List<String> consultarSecciones(String comunidad){
		
		return repo.consultarSecciones(comunidad);
	}
	
	//Consulta las casillas de acuerdo a la seccion
	public List<String> consultarCasillas(String seccion){
		return repo.consultarCasillas(seccion);
	}

}
