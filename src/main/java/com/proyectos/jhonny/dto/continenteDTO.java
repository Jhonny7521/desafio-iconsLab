package com.proyectos.jhonny.dto;

import lombok.Getter;
import lombok.Setter;

// Nos sirve para manejar informacion
@Getter
@Setter
public class continenteDTO {

	private Long id;
	private String imagen;
	private String denominacion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
}
