package com.alkemy.icons.entity.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContinenteDTO {

	private Long id;
	@NotNull(message = "La imagen es nula")
	private String imagen;
	@Length(min = 10, message = "La longitud minima es de 10")
	private String denominacion;
	private List<PaisDTO> paises;
	
}
