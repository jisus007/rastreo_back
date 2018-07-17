package com.vectoritcgroup.rastreo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vectoritcgroup.rastreo.model.Objeto;


public interface ObjetoRepository extends CrudRepository<Objeto, Long> {
	
	Objeto findByIdObjeto(long idObjeto);
	
	List<Objeto> findByNombre(String nombre);

}
