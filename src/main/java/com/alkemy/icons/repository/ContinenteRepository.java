package com.alkemy.icons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alkemy.icons.entity.Continente;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Long> {

	@Query("SELECT c FROM Continente c JOIN c.paises p WHERE p.id LIKE :id")
	public Continente getOneByPais(@Param("id") Long id);
	
}
