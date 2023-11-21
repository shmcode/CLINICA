package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Carrera extends Identificable{
	
	private String facultad;
	
	private String nombre;

}
