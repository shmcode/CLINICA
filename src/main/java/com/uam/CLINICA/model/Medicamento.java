package com.uam.CLINICA.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter

public class Medicamento extends Identificable {
	
    @Required
	private String nombre;
	
    @Required
	private String nombreGenerico;

    
    @Required
	private Integer cantidadExistencia;

	//@OneToMany
	//@ReferenceView("Simple")
	//private DetalleMedicamento detalleMedicamento;

}
