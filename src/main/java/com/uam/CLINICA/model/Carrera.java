package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Carrera {
	
	private String facultad;
	
	private String carrera;

}
