package com.uninove.proten.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_alimentos")
public class Alimentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome_alimento")
	private String nomeAlimento;
	
	public Alimentos() {
		
	}

	public Alimentos(Long id, String nomeAlimento) {
		super();
		this.id = id;
		this.nomeAlimento = nomeAlimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_alimento() {
		return nomeAlimento;
	}

	public void setNome_alimento(String nome_alimento) {
		this.nomeAlimento = nome_alimento;
	}
	
	

}
