package com.uam.CLINICA.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.uam.CLINICA.Calculadores.*;

import lombok.*;

@Entity
@Table(name = "Visita") //database table
@Getter @Setter

public class Visita extends Identificable{

	@DefaultValueCalculator(CurrentLocalDateCalculator.class) // Fecha actual
	private LocalDate date; //fecha

	@DefaultValueCalculator(HoraCalculador.class)
	private String horadeEntrada;

	//@Required
	private String horadeSalida;
	
	@ManyToOne(fetch = FetchType.LAZY,//Relationship optional
			optional = true)
	@ReferenceView("Simple")
    private Visitante visitante;
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
	private Receta receta;

}
