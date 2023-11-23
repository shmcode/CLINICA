package com.uam.CLINICA.model;

import javax.persistence.*;

import com.uam.CLINICA.Calculadores.CorreoValidador;
import lombok.*;
import org.openxava.annotations.PropertyValidator;

@Embeddable
@Getter
@Setter
public class Correo {

	@PropertyValidator(value = CorreoValidador.class)
	private String correo;

}
