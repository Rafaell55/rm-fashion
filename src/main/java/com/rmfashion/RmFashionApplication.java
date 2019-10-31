package com.rmfashion;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rmfashion.domain.CategoriaFeminino;
import com.rmfashion.domain.CategoriaMasculino;
import com.rmfashion.domain.Variados;
import com.rmfashion.repositories.CategoriaFemininoRepository;
import com.rmfashion.repositories.CategoriaMasculinoRepository;
import com.rmfashion.repositories.VariadosRepository;

@SpringBootApplication
public class RmFashionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RmFashionApplication.class, args);
	}
	@Autowired
	CategoriaFemininoRepository categoriaFemininoRepository;
	
	@Autowired
	CategoriaMasculinoRepository categoriaMasculinoRepository;
	
	@Autowired
	VariadosRepository variadosRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		// Lista de categoria Feminino
		CategoriaFeminino catfem1 = new CategoriaFeminino(null, "Moda Íntima");
		CategoriaFeminino catfem2 = new CategoriaFeminino(null, "Moda Praia");
		CategoriaFeminino catfem3 = new CategoriaFeminino(null, "Saias");
		CategoriaFeminino catfem4 = new CategoriaFeminino(null, "Vestidos");
		CategoriaFeminino catfem5 = new CategoriaFeminino(null, "Blusas e Camisetas");
		CategoriaFeminino catfem6 = new CategoriaFeminino(null, "Calças");
		CategoriaFeminino catfem7 = new CategoriaFeminino(null, "Camisas");
		CategoriaFeminino catfem8 = new CategoriaFeminino(null, "Jeans");
		CategoriaFeminino catfem9 = new CategoriaFeminino(null, "Macacões e Jardineiras");
		
		categoriaFemininoRepository.saveAll(Arrays.asList(catfem1, catfem2, catfem3, catfem4, catfem5, catfem6, catfem7, catfem8, catfem9));
		

		// Lista de Categoria Masculino
		CategoriaMasculino catmasc1 = new CategoriaMasculino(null, "Bermudas e Shorts");
		CategoriaMasculino catmasc2 = new CategoriaMasculino(null, "Calças");
		CategoriaMasculino catmasc3 = new CategoriaMasculino(null, "Camisas");
		CategoriaMasculino catmasc4 = new CategoriaMasculino(null, "Camisetas");
		CategoriaMasculino catmasc5 = new CategoriaMasculino(null, "Esportivo");
		CategoriaMasculino catmasc6 = new CategoriaMasculino(null, "Jeans");
		CategoriaMasculino catmasc7 = new CategoriaMasculino(null, "Moda Íntima");
		CategoriaMasculino catmasc8 = new CategoriaMasculino(null, "Moletons");
		CategoriaMasculino catmasc9 = new CategoriaMasculino(null, "Polos");
		CategoriaMasculino catmasc10 = new CategoriaMasculino(null, "Regatas");
		
		
		categoriaMasculinoRepository.saveAll(Arrays.asList(catmasc1, catmasc2, catmasc3, catmasc4, catmasc5, catmasc6, catmasc7, catmasc8, catmasc9, catmasc10));
		
		
		// Lista de categoria de produtos Variados
		Variados var1 = new Variados(null, "SEX SHOP");

		
		variadosRepository.saveAll(Arrays.asList(var1));
	}

}
