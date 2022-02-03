package com.alkemy.icons.entity.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IconDTO {
	
	private Long id;
	
	private String denominacion;

	private Date fechaCreacion;
	
	private Integer longitud;
	
	private String historia;
	
}
