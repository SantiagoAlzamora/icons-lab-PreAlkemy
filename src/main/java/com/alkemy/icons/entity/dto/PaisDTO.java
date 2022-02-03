package com.alkemy.icons.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaisDTO {

	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	private Long cantidadHabitantes;
	
	private Long superficie; //m2
	
	
	private IconDTO icon;
	
}
