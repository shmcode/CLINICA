package com.uam.CLINICA.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity 
@Getter @Setter
public class Visita extends Identificable{

	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) // Fecha actual
	private LocalDate date; //fecha

	//@StringTime  @Required
	@Required
	//@DefaultValueCalculator(CurrentLocalTimeCalculator.class)
	private String horadeEntrada;

	//@StringTime  @Required
	@Required
	private String horadeSalida;

	/*@Column(length=10) @Required //cif - cedula
	private String cif;*/

	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
    private Visitante visitante;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
    private Receta receta;

}
