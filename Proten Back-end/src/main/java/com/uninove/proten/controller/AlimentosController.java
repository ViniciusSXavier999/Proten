package com.uninove.proten.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uninove.proten.model.Alimentos;
import com.uninove.proten.repository.AlimentosRepository;

@RestController
@RequestMapping(value = "/alimentos")
public class AlimentosController {

	@Autowired
	AlimentosRepository repository;

	// MÉTODO QUE BUSCA TODOS OS DADOS DO BANCO DE DADOS.
	@GetMapping
	public List<Alimentos> findAll() {
		List<Alimentos> resultado = repository.findAll();
		return resultado;

	}

	// Busca por ID
	@GetMapping(value = "/{id}")
	public Alimentos findById(@PathVariable Long id) {
		Alimentos result = repository.findById(id).get();
		return result;
	}

	// Insert no banco de dados 
	@PostMapping("/adicionar")
	public Alimentos salvaAlimento(@RequestBody Alimentos alimentos) {
		return repository.save(alimentos);
	}
	
	// Atualiza no banco de dados 
	@PutMapping("/atualizar")
	public Alimentos atualizaAlimentos(@RequestBody Alimentos alimentos) {
		return repository.save(alimentos);
	}
	
	


}
