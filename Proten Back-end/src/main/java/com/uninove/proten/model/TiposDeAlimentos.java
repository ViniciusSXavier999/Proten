package com.uninove.proten.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipos_de_Alimentos")
public class TiposDeAlimentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_tipo_alimento")
	private String nomeTipoAlimento;
	
	public TiposDeAlimentos() {
		
	}

	public TiposDeAlimentos(Long id, String nomeTipoAlimento) {
		super();
		this.id = id;
		this.nomeTipoAlimento = nomeTipoAlimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_tipo_alimento() {
		return nomeTipoAlimento;
	}

	public void setNome_tipo_alimento(String nome_tipo_alimento) {
		this.nomeTipoAlimento = nome_tipo_alimento;
	}
	
	

}
