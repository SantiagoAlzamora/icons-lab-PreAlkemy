package com.alkemy.icons.service;

import com.alkemy.icons.entity.dto.ContinenteDTO;

public interface ContinenteService extends CRUDService<ContinenteDTO> {
	
	public ContinenteDTO getOneByPais(Long id);
	
}
