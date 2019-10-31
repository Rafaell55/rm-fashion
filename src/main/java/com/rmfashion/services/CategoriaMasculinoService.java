package com.rmfashion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmfashion.domain.CategoriaMasculino;
import com.rmfashion.repositories.CategoriaMasculinoRepository;

@Service
public class CategoriaMasculinoService {
	
	@Autowired
	private CategoriaMasculinoRepository repo;

	public CategoriaMasculino buscar(Integer id) {
		Optional<CategoriaMasculino> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
