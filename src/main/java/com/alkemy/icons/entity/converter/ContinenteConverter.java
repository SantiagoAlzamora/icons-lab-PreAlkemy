package com.alkemy.icons.entity.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.icons.entity.Continente;
import com.alkemy.icons.entity.dto.ContinenteDTO;


@Component("ContinenteConverter")
public class ContinenteConverter{

	public Continente continenteDTO2Entity(ContinenteDTO dto) {
		Continente entity = new Continente();
		if(dto.getId()!= null) {
			entity.setId(dto.getId());
		}
		entity.setImagen(dto.getImagen());
		entity.setDenominacion(dto.getDenominacion());
		return entity;
	}

	public ContinenteDTO continenteEntity2DTO(Continente entity) {
		ContinenteDTO dto = new ContinenteDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		//dto.setPaises(entity.getPaises());
		return dto;
	}
	
	public List<ContinenteDTO> continenteEntityList2DTOList(List<Continente>entities){
		List<ContinenteDTO>dtos=new ArrayList<>();
		for (Continente entity : entities) {
			ContinenteDTO dto = continenteEntity2DTO(entity);
			dtos.add(dto);
		}
		return dtos;
		
	}

}
