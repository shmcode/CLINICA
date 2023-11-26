package com.uam.CLINICA.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Embeddable
@Getter @Setter
@View(members = "numCompra, fecha;"
		+ "cantidad;" +
		"proveedor;"
)

	 
public class Compra{
	
	//@Required
	private int numCompra;

	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	private Medicamento medicamento;
	
	//@Required
	private int cantidad;
	
	@ManyToOne
	@DescriptionsList
	private Proveedor proveedor;

	
}
