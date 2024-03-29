package com.rmfashion.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rmfashion.domain.Variado;
import com.rmfashion.services.VariadosService;

@RestController
@RequestMapping(value = "/variados")
public class VariadosResource {
	
	@Autowired
	private VariadosService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Variado obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);	
	}

}
