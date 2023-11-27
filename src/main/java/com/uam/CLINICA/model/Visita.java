package com.uam.CLINICA.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.uam.CLINICA.Calculadores.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members="usuario;"
		+ "anyo,numero;"
		+ "horaEntrada,horaSalida,date;"
		+ "visitante;"
		+ "receta;")

public class Visita extends Identificable{
	
	@Column(length=6)
	@DefaultValueCalculator(CurrentYearCalculator.class)
	int anyo;
	
	@Column(length=6)
	@DefaultValueCalculator(value = CalculadorSiguienteNumeroParaAnyo.class,
	properties = @PropertyValue(name = "anyo"))
	@ReadOnly
	int numero;
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = false)
	@DescriptionsList
    private Usuario usuario;
	
	@Column(length=10)
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate date; 
	
	@Column(length=10)
	@DefaultValueCalculator(HoraCalculador.class)
	private String horaEntrada;

	@Column(length=10)
	private String horaSalida;
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = false)
	@ReferenceView("Simple")
    private Visitante visitante;
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = false)
	@ReferenceView("Simple")
	private Receta receta;

}
