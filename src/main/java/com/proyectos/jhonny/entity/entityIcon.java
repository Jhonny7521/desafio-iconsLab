package com.proyectos.jhonny.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="icon")
@Getter
@Setter
public class entityIcon {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	@Column(name= "fecha_creacion")
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	private LocalDate fechaCreacion;
	
	private Long altura;
	
	private String historia;
	
	//private boolean deleted = Boolean.FALSE;
	
	//@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) 
	//@JoinColumn(name = "pais_id")
	//private entityPais continente;
	
	@ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
	private List<entityPais> paises = new ArrayList<>();
	
	//Add and remove paises
	public void addPais(entityPais pais) { 
		this.paises.add(pais);
	}
	
	public void removePais(entityPais pais) { 
		this.paises.remove(pais);
	}
}
