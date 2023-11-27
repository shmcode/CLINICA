package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple",members = "cifID,primerNombre, primerApellido")

public class Visitante extends Identificable{
	
	@Column(length=15)
	private String cifID;
	
	@Column(length=25)
	private String primerNombre;
	
	@Column(length=25)
	private String primerApellido;
	
	@ElementCollection
	@ListProperties("identificadorPais,numeroTelefono")
	private Collection<Telefono> telefonos;
	
	@ManyToOne
    @DescriptionsList
    private Carrera carrera;
	
}
