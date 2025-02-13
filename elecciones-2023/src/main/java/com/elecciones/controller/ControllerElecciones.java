package com.elecciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.elecciones.model.Candidatos;
import com.elecciones.model.Votos;
import com.elecciones.service.CanditatosServiceImpl;
import com.elecciones.service.SeccionesServiceImpl;
import com.elecciones.service.VotosServiceImpl;

import jakarta.validation.Valid;

@CrossOrigin
@RequestMapping("elecciones")
@RestController
public class ControllerElecciones {
	
	@Autowired
	private CanditatosServiceImpl candidatosService;
	
	@Autowired
	private SeccionesServiceImpl seccionesService;
	
	@Autowired
	private VotosServiceImpl votosService;
	
	
	@GetMapping("/candidatos")
	@ResponseBody
	public List<Candidatos> consultarCandidatos(){
		
		return candidatosService.consultarCandidatos();
	}
	
	@GetMapping("/comunidades")
	@ResponseBody
	public List<String> consultarComunidades(){
		return seccionesService.consultarComunidades();
	}
	
	
	@GetMapping("/secciones/{comunidad}")
	@ResponseBody
	public List<String> consultarSecciones(@PathVariable String comunidad){
		return seccionesService.consultarSecciones(comunidad);
	}
	
	@GetMapping("/casillas/{seccion}")
	@ResponseBody
	public List<String> consultarCasillas(@PathVariable String seccion){
		return seccionesService.consultarCasillas(seccion);
	}
	
	@GetMapping("/partidos")
	@ResponseBody
	public List<String> consultarPartidos(){
		return candidatosService.consultarPartidos();
	}
	
	@GetMapping("validavoto/{comunidad}/{seccion}/{casilla}/{partido}")
	@ResponseBody
	public List<String> validarVotos(@PathVariable String comunidad,@PathVariable String seccion, 
			@PathVariable String casilla, @PathVariable String partido){
		return votosService.validarVotos(comunidad, seccion, casilla, partido);
	}
	
	@PostMapping("/registrovoto")
	@ResponseStatus(HttpStatus.CREATED)
	public Votos saveVotos(@RequestBody @Valid Votos votos) {
		return votosService.saveVotos(votos);
	}
	
	@GetMapping("/getvotospartido")
	@ResponseBody
	public List<String> getVotosPartido(){
		return votosService.getVotosPartido();
	}

}
