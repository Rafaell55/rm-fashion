package com.rmfashion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmfashion.domain.Variados;
import com.rmfashion.repositories.VariadosRepository;

@Service
public class VariadosService {
	
	@Autowired
	private VariadosRepository repo;

	public Variados buscar(Integer id) {
		Optional<Variados> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
