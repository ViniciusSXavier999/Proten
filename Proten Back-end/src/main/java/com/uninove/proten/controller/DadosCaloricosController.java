package com.uninove.proten.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uninove.proten.model.DadosCaloricos;
import com.uninove.proten.repository.DadosCaloricosInterface;

@RestController
@RequestMapping(value = "/dadoscaloricos")
public class DadosCaloricosController {

	@Autowired
	DadosCaloricosInterface repository;

	@GetMapping
	public List<DadosCaloricos> select() {
		List<DadosCaloricos> result = repository.findAll();
		return result;
	}

	// Busca por ID
	@GetMapping(value = "/{id}")
	public DadosCaloricos findById(@PathVariable Long id) {
		DadosCaloricos result = repository.findById(id).get();
		return result;
	}

	// Insert no banco de dados
	@PostMapping("/adicionar")
	public DadosCaloricos salvaDados(@RequestBody DadosCaloricos dadosCaloricos) {
		return repository.save(dadosCaloricos);
	}

	// Atualiza no banco de dados
	@PutMapping("/atualizar")
	public DadosCaloricos atualizaDados(@RequestBody  DadosCaloricos dadosCaloricos) {
		return repository.save(dadosCaloricos);
	}
	
	// @DeleteMapping("/deletar")
	// public void deletaDados(@RequestBody  DadosCaloricos dadosCaloricos) {
	//	repository.delete(dadosCaloricos);
	// }
	

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	

}
