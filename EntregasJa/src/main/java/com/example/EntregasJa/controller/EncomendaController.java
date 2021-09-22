package com.example.EntregasJa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EntregasJa.model.Encomenda;
import com.example.EntregasJa.repository.EncomendaRepository;

@RestController
@RequestMapping("/encomenda")
@CrossOrigin("*")
public class EncomendaController {
	
	@Autowired
	private EncomendaRepository repository;
	
	
	@GetMapping("/{id}")
    public ResponseEntity<Encomenda>GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/rastreio/{numeroRastreio}")
    public ResponseEntity<Encomenda>GetByNumeroRastreio(@PathVariable String numeroRastreio){
		return repository.findByNumeroRastreio(numeroRastreio)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	

}
