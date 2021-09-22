package com.example.EntregasJa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EntregasJa.model.Encomenda;

@Repository
public interface EncomendaRepository extends JpaRepository<Encomenda,Long> {

	Optional<Encomenda> findByNumeroRastreio(String numeroRastreio);
	
}
