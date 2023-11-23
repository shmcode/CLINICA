
package com.uam.CLINICA.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "numCompra, fecha;"
		+ "medicamento, cantidad;" +
		"proveedor;")

public class Compra extends Identificable{
	
	private String numCompra;

	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fecha;
	
	
	@ManyToOne
	@DescriptionsList
	private Medicamento medicamento;
	
	
	private int cantidad;
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "nombreProveedor")
	private Proveedor proveedor;

}
