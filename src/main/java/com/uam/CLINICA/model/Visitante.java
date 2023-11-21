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
	private String id; //no pueden haber repetidos
		
	private String primerNombre;
	
	private String primerApellido;
	
	@ElementCollection
	@ListProperties("identificadorPais,numeroTelefono")
	private Collection<Telefono> telefonos;
	
	@ManyToOne
    @DescriptionsList
    private Carrera carrera;
	
}
