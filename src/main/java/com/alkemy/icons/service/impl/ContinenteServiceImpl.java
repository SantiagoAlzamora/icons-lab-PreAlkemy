package com.alkemy.icons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.icons.entity.Continente;
import com.alkemy.icons.entity.converter.ContinenteConverter;
import com.alkemy.icons.entity.dto.ContinenteDTO;
import com.alkemy.icons.repository.ContinenteRepository;
import com.alkemy.icons.service.ContinenteService;

@Service("ContinenteService")
public class ContinenteServiceImpl implements ContinenteService{
	
	@Autowired
	private ContinenteConverter continenteConverter;

	@Autowired
	private ContinenteRepository continenteRepository;

	@Override
	public ContinenteDTO save(ContinenteDTO dto){
		Continente entity= continenteConverter.continenteDTO2Entity(dto);
		Continente savedEntity = continenteRepository.save(entity);
		ContinenteDTO result = continenteConverter.continenteEntity2DTO(savedEntity);
		return result;
	}

	@Override
	public ContinenteDTO edit(ContinenteDTO dto){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id){
		continenteRepository.deleteById(id);
		
	}

	@Override
	public ContinenteDTO getOne(Long id) {
		return continenteConverter.continenteEntity2DTO(continenteRepository.getById(id));
	}

	@Override
	public List<ContinenteDTO> getAll() {
		List<Continente> entities = continenteRepository.findAll();
		List<ContinenteDTO>result = continenteConverter.continenteEntityList2DTOList(entities);
		return result;
	}

	@Override
	public ContinenteDTO getOneByPais(Long id) {
		return continenteConverter.continenteEntity2DTO(continenteRepository.getOneByPais(id));
	}

	
	
}



