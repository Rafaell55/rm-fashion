package com.rmfashion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmfashion.domain.Variado;
import com.rmfashion.repositories.VariadoRepository;
import com.rmfashion.services.exceptions.ObjectNotFoundException;

@Service
public class VariadosService {
	
	@Autowired
	private VariadoRepository repo;

	public Variado buscar(Integer id) {
		Optional<Variado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado! Id: " + id + ", Tipo: " + Variado.class.getName()));
	}
}
