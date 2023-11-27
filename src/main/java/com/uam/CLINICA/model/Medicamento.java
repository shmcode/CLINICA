package com.uam.CLINICA.model;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple", members="nombre,nombreGenerico;"
		+ "cantidadExistencia;")
public class Medicamento{
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@Hidden
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String identificador;
	
	@Column(length=9)
	int id;
	
	private String nombre;
	
	private String nombreGenerico;
    
	private Integer cantidadExistencia;

}
