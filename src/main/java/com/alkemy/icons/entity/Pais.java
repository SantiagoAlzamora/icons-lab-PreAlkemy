package com.alkemy.icons.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	@Column(name = "cantidad_habitantes")
	private Long cantidadHabitantes;
	
	private Long superficie; //m2
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Icon icon;
	
}
