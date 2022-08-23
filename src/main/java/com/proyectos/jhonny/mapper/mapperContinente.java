package com.proyectos.jhonny.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.proyectos.jhonny.dto.continenteDTO;
import com.proyectos.jhonny.entity.entityContinente;

@Component
public class mapperContinente {
	
	public entityContinente continenteDTO2Entity(continenteDTO dto) {
		
		entityContinente entityContinente = new entityContinente();
		entityContinente.setImagen(dto.getImagen());
		entityContinente.setDenominacion(dto.getDenominacion());
		return entityContinente;
		
	}
	
	public continenteDTO entityContinente2DTO(entityContinente entity) {
		
		continenteDTO dto = new continenteDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		return dto;
		
	}
	
	public List<continenteDTO> entityContinenteList2DTOList(List<entityContinente> entities) {
		List<continenteDTO> dtos = new ArrayList<>();
		for (entityContinente entity : entities) {
			dtos.add(entityContinente2DTO(entity));
		}
		return dtos;
		
	}

}
