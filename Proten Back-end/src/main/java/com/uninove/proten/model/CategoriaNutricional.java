package com.uninove.proten.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categoria_nutricional")
public class CategoriaNutricional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipo_nutricional")
	private String tipoNutricional;
	
	public CategoriaNutricional() {
		
	}

	public CategoriaNutricional(Long id, String tipoNutricional) {
		super();
		this.id = id;
		this.tipoNutricional = tipoNutricional;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo_nutricional() {
		return tipoNutricional;
	}

	public void setTipo_nutricional(String tipo_nutricional) {
		this.tipoNutricional = tipo_nutricional;
	}
	
	

	
	
	
	
}
