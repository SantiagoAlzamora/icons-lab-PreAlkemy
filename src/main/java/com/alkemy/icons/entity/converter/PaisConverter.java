package com.alkemy.icons.entity.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alkemy.icons.entity.Pais;
import com.alkemy.icons.entity.dto.PaisDTO;

@Component("PaisConverter")
public class PaisConverter {
	
	@Autowired
	private IconConverter iconConverter;

	public Pais paisDTO2Entity(PaisDTO dto) {
		Pais entity = new Pais();
		if (dto.getId()!=null) {
			entity.setId(dto.getId());
		}
		entity.setImagen(dto.getImagen());
		entity.setDenominacion(dto.getDenominacion());
		entity.setIcon(iconConverter.iconDTO2Entity(dto.getIcon()));
		entity.setSuperficie(dto.getSuperficie());
		entity.setCantidadHabitantes(dto.getCantidadHabitantes());
		return entity;
	}
	
	public PaisDTO paisEntity2DTO(Pais entity) {
		PaisDTO dto = new PaisDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		dto.setIcon(iconConverter.iconEntity2DTO(entity.getIcon()));
		dto.setCantidadHabitantes(entity.getCantidadHabitantes());
		dto.setSuperficie(entity.getSuperficie());
		return dto;
	}
	
	public List<PaisDTO> paisEntityList2DTOList(List<Pais> entities){
		List<PaisDTO> dtos = new ArrayList<>();
		for (Pais entity : entities) {
			dtos.add(paisEntity2DTO(entity));
		}
		return dtos;
	}
	
	public List<Pais> paisDTOList2EntityList(List<PaisDTO> dtos){
		List<Pais> entities = new ArrayList<>();
		for (PaisDTO dto : dtos) {
			entities.add(paisDTO2Entity(dto));
		}
		return entities;
	}
	
	
}
