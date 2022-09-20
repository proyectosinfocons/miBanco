package com.proyecto.demo.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class variablesRegistros {

	  @Value("${prue.total-cambio}")
	  private String tipodecambio;
}
