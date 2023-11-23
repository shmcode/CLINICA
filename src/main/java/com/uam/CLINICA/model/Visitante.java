package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple",members = "primerNombre,primerApellido")

public class Visitante{
	
	@Id
	//@Required
	private String id; //no pueden haber repetidos
	
	//@Required
	private String primerNombre;
	
	//@Required
	private String primerApellido;
	
	//@Required
	@ElementCollection
	@ListProperties("identificadorPais,numeroTelefono")
	private Collection<Telefono> telefonos;
	
	//@Required
	@ManyToOne
    @DescriptionsList
    private Carrera carrera;
	
}
