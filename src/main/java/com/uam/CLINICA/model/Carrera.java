package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Carrera extends Identificable{
	
	//@Required
	private String facultad;
	
	//@Required
	private String nombre;

}
