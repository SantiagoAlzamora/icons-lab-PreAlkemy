package com.alkemy.icons.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "continente")
@Getter
@Setter
public class Continente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long id;
	private String imagen;
	private String denominacion;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Pais> paises;
	
	
}