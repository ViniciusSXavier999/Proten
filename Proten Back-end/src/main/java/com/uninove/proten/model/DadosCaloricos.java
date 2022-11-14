package com.uninove.proten.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dados_caloricos")
public class DadosCaloricos {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String medida;
	private String peso;
	private String kcal;
	
	@ManyToOne
	@JoinColumn(name = "categoria_nutricional_ID")
	private CategoriaNutricional categoriaNutricional;
	
	@ManyToOne
	@JoinColumn(name = "tipos_alimentos_ID")
	private TiposDeAlimentos tiposDeAlimentos;
	
	@ManyToOne
	@JoinColumn(name = "alimentos_ID")
	private Alimentos alimentos;
	
	public DadosCaloricos() {
		
	}

	public DadosCaloricos(Long id, String medida, String peso, String kcal, CategoriaNutricional categoriaNutricional,
			TiposDeAlimentos tiposDeAlimentos, Alimentos alimentos) {
		super();
		this.id = id;
		this.medida = medida;
		this.peso = peso;
		this.kcal = kcal;
		this.categoriaNutricional = categoriaNutricional;
		this.tiposDeAlimentos = tiposDeAlimentos;
		this.alimentos = alimentos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getKcal() {
		return kcal;
	}

	public void setKcal(String kcal) {
		this.kcal = kcal;
	}

	public CategoriaNutricional getCategoriaNutricional() {
		return categoriaNutricional;
	}

	public void setCategoriaNutricional(CategoriaNutricional categoriaNutricional) {
		this.categoriaNutricional = categoriaNutricional;
	}

	public TiposDeAlimentos getTiposDeAlimentos() {
		return tiposDeAlimentos;
	}

	public void setTiposDeAlimentos(TiposDeAlimentos tiposDeAlimentos) {
		this.tiposDeAlimentos = tiposDeAlimentos;
	}

	public Alimentos getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(Alimentos alimentos) {
		this.alimentos = alimentos;
	}
	
	
}
