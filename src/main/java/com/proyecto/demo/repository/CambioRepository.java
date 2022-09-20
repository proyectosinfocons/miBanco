package com.proyecto.demo.repository;

import com.proyecto.demo.model.tipodeCambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<tipodeCambio,Integer>{
//findByMonedadeOrigenAndMonedadeDestino
	  tipodeCambio findByMonedadeOrigenAndMonedadeDestino(String monedaOrigen, String monedaDestino);
}
