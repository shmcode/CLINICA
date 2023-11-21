package com.uam.CLINICA.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter

public class Medicamento extends Identificable {
	
	@Column(length = 20)
    @Required
	private String nombre;
	
	@Column(length = 20)
    @Required
	private String nombreGenerico;
	
	@Column(length = 10)
    @Required
	private int cantidadExistencia;

	@OneToMany
	@ReferenceView("Simple")
	private DetalleMedicamento detalleMedicamento;

}
