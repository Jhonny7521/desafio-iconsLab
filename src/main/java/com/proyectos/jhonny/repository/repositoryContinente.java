package com.proyectos.jhonny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectos.jhonny.entity.entityContinente;

@Repository
public interface repositoryContinente extends JpaRepository<entityContinente, Long>{
	
	

}
