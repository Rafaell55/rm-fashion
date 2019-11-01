package com.rmfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmfashion.domain.ProdutoVariado;

@Repository
public interface ProdutoVariadoRepository extends JpaRepository<ProdutoVariado, Integer>{

}
