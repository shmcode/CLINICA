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
	@DefaultValueCalculator(value=SiguienteNumeroVisita.class,
	properties=@PropertyValue(name="anyo"))
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
	private String horadeEntrada;

	@Required
	@Column(length=10)
	private String horadeSalida;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ReferenceView("Simple")
	private Visitante visitante;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false)
	@ReferenceView("Simple")
	private Receta receta;
	@PrePersist
	@PreUpdate
	private void validarHoras() throws Exception {
		if (horadeEntrada != null && horadeSalida != null) {
			LocalTime horaEntrada = LocalTime.parse(horadeEntrada);
			LocalTime horaSalida = LocalTime.parse(horadeSalida);

			if (horaSalida.isBefore(horaEntrada)) {
				throw new javax.validation.ValidationException(
						"La hora de salida debe ser mayor que la hora de entrada."
				);
			}
		}
	}
}
