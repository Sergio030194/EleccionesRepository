package com.elecciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Table(name = "votos")
@Entity
public class Votos {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@NotNull
	private Integer idVoto;
	
	@Column
	@NotBlank
	private String comunidad;
	
	@Column
	@NotBlank
	private String seccion;
	
	@Column
	@NotBlank
	private String casilla;
	
	@Column
	@NotBlank
	private String partido;
	
	@Column
	@NotBlank
	private String votos;



	public Integer getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(Integer idVoto) {
		this.idVoto = idVoto;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getCasilla() {
		return casilla;
	}

	public void setCasilla(String casilla) {
		this.casilla = casilla;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getVotos() {
		return votos;
	}

	public void setVotos(String votos) {
		this.votos = votos;
	}
	
	

}
