package com.uam.CLINICA.model;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
import org.openxava.calculators.CurrentLocalDateCalculator;

@Entity
@Getter @Setter

public class Compra extends Identificable{

	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fecha;
	
	private int cantidad;
	
	@ManyToOne
	@ReferenceView("Simple")
	private Medicamento medicamento;
	
	@ManyToOne
	@ReferenceView("Simple")
	private Proveedor proveedor;
	
}
