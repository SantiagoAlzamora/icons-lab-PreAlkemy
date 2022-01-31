package com.alkemy.icons.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alkemy.icons.entity.dto.ContinenteDTO;
import com.alkemy.icons.service.ContinenteService;


@RestController
@RequestMapping("continentes")
public class ContinenteController {
	
	@Autowired
	private ContinenteService continenteService;
	
	@PostMapping
	public ResponseEntity<ContinenteDTO> save(@Valid @RequestBody ContinenteDTO continente){
		
		ContinenteDTO continenteSaved = continenteService.save(continente);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(continenteSaved);
	}
	
	@GetMapping
	public ResponseEntity<List<ContinenteDTO>> getAll(){
		return ResponseEntity.ok().body(continenteService.getAll());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ContinenteDTO> edit(@Valid @RequestBody ContinenteDTO continente, @PathVariable Long id){
		ContinenteDTO continenteUpdated = continenteService.save(continente);
		return ResponseEntity.status(HttpStatus.OK).body(continenteUpdated);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		return ResponseEntity.ok("El Continente ha sido eliminado con exito");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ContinenteDTO> getOne(@PathVariable Long id){
		return ResponseEntity.ok().body(continenteService.getOne(id));
	}
	
	@GetMapping("/paisId/{id}")
	public ResponseEntity<ContinenteDTO> getOneByPais(@PathVariable Long id){
		return ResponseEntity.ok().body(continenteService.getOneByPais(id));
	}

}
