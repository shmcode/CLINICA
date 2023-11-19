package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Correo {
	
	private String correo;

}
