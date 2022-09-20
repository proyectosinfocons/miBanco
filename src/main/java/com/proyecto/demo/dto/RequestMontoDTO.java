package com.proyecto.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestMontoDTO {
	
	@ApiModelProperty(notes = "El monto actual")
	  private Double monto;
	
	@ApiModelProperty(notes = "La moneda origen")
	  private String monedadeOrigen;

	@ApiModelProperty(notes = "La moneda destino")
	  private String monedadeDestino;

}
