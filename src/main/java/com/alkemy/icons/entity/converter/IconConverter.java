package com.alkemy.icons.entity.converter;

import org.springframework.stereotype.Component;

import com.alkemy.icons.entity.Icon;
import com.alkemy.icons.entity.dto.IconDTO;

@Component("IconConverter")
public class IconConverter {

	public Icon iconDTO2Entity(IconDTO dto) {
		
		Icon entity = new Icon();
		if (dto.getId() !=null) {
			entity.setId(dto.getId());
		}
		entity.setDenominacion(dto.getDenominacion());
		entity.setFechaCreacion(dto.getFechaCreacion());
		entity.setHistoria(dto.getHistoria());
		entity.setLongitud(dto.getLongitud());
		return entity;
	}
	
	public IconDTO iconEntity2DTO(Icon entity) {
		
		IconDTO dto = new IconDTO();
		dto.setId(entity.getId());
		dto.setDenominacion(entity.getDenominacion());
		dto.setHistoria(entity.getHistoria());
		dto.setFechaCreacion(entity.getFechaCreacion());
		dto.setLongitud(entity.getLongitud());
		return dto;
	}
	
}
