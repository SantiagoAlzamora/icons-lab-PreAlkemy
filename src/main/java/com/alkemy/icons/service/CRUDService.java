package com.alkemy.icons.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface CRUDService<D> {

		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
		public D save(D d);

		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
		public D edit(D d);
		
		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
		public void delete(Long id);

		@Transactional(readOnly = true)
		public D getOne(Long id);

		@Transactional(readOnly = true)
		public List<D> getAll();
	
}
