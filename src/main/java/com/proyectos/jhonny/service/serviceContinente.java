package com.proyectos.jhonny.service;

import java.util.List;

import com.proyectos.jhonny.dto.continenteDTO;

public interface serviceContinente {

	continenteDTO save(continenteDTO dto);
	
	List<continenteDTO> getAllContinentes();
}
