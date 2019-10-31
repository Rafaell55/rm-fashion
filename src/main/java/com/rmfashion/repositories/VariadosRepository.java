package com.rmfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmfashion.domain.Variados;

@Repository
public interface VariadosRepository extends JpaRepository<Variados, Integer>{

}
