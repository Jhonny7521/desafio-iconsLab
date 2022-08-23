package com.proyectos.jhonny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.jhonny.dto.continenteDTO;
import com.proyectos.jhonny.service.serviceContinente;

@RestController
@RequestMapping("continentes")
public class controllerContinente {
	
	@Autowired
	private serviceContinente serviceContinente;
	
	@GetMapping
	public ResponseEntity<List<continenteDTO>> getAll() {
		List<continenteDTO> continentes = serviceContinente.getAllContinentes();
		return ResponseEntity.ok().body(continentes);
	}
	
	@PostMapping
	public ResponseEntity<continenteDTO> save(@RequestBody continenteDTO continente){
		continenteDTO continenteGuardado = serviceContinente.save(continente);
		return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
	}
}
