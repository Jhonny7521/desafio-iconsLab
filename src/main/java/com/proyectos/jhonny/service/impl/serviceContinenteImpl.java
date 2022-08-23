package com.proyectos.jhonny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectos.jhonny.dto.continenteDTO;
import com.proyectos.jhonny.entity.entityContinente;
import com.proyectos.jhonny.mapper.mapperContinente;
import com.proyectos.jhonny.repository.repositoryContinente;
import com.proyectos.jhonny.service.serviceContinente;

@Service
public class serviceContinenteImpl implements serviceContinente{
	
	@Autowired 
	private mapperContinente mapperContinente;
	@Autowired 
	private repositoryContinente repositoryContinente;
	
	public continenteDTO save(continenteDTO dto) {
		
		entityContinente entity = mapperContinente.continenteDTO2Entity(dto);
		entityContinente entitySaved= repositoryContinente.save(entity);
		continenteDTO result = mapperContinente.entityContinente2DTO(entitySaved);
		return result;
	}

	public List<continenteDTO> getAllContinentes() {
		List<entityContinente> entities = repositoryContinente.findAll();
		List<continenteDTO> result = mapperContinente.entityContinenteList2DTOList(entities);
		return result;
	}

}
