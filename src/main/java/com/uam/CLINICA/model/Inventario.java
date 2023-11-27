package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.uam.CLINICA.Calculadores.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members=
			"anyo, numero;"
			+ "medicamento;"
		+ "compra;")

public class Inventario{
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@Hidden
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String identificador;
	
	@Column(length=4)
	@DefaultValueCalculator(CurrentYearCalculator.class)
	int anyo;
	
	@Column(length=6)
	@DefaultValueCalculator(value = CalculadorSiguienteNumeroParaAnyo.class,
	properties = @PropertyValue(name = "anyo"))
	@ReadOnly
	int numero;
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
	@ReferenceView("Simple")
	private Medicamento medicamento;
    
    @ElementCollection
    @ListProperties("medicamento.id,medicamento.nombre,cantidad,lote,vencimiento,presentacion,proveedor.compania")
    private Collection<Compra> compra;
	
}
