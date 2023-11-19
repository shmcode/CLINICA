package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter

public class Compra extends Identificable{
	
	private String numCompra;
	
	private Date fecha;
	
	private int cantidad;
	
	@ManyToOne
	@ReferenceView("Simple")
	private Medicamento medicamento;
	
	@ManyToOne
	@ReferenceView("Simple")
	private Proveedor proveedor;
	
}
