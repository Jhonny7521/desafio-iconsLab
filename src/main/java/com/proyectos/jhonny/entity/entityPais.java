package com.proyectos.jhonny.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class entityPais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	@Column(name="cant_habitantes") // se utiliza cuando el nombre de la columna es diferente a la variable en java
	private Long cantidadHabitantes;
	
	private Long superficie;
	
	// FetchType.EAGER es para cuando se haga una solicitud de pais este va a traer los datos de continente
	// cascadeType.ALL es para que las operaciones sean en cascada, ejem si se hace un delete de un pais tambien se haga del continente
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) 
	@JoinColumn(name = "continente_id", insertable = false, updatable = false)
	private entityContinente continente;
	
	@Column(name = "continente_id", nullable = false)
	private Long continenteId;
	
	@ManyToMany(
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	@JoinTable(
			name="icon_pais",
			joinColumns = @JoinColumn(name = "pais_id"),
			inverseJoinColumns = @JoinColumn(name = "icon_id"))
	private Set<entityIcon> icons = new HashSet<>();
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		final entityPais other = (entityPais) obj;
		return other.id == this.id;
	}

}
