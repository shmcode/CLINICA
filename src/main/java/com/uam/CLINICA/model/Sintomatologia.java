package com.uam.CLINICA.model;

import javax.persistence.*;

import com.uam.CLINICA.Calculadores.Validador;
import lombok.*;
import org.openxava.annotations.PropertyValidator;


@Entity
@Getter
@Setter
@NamedQueries({
		@NamedQuery(name="Sintomatologia.findByNombre",query="select e from Sintomatologia e where e.nombre like ?1")
})

public class Sintomatologia extends Identificable{

	@PropertyValidator(value= Validador.class)
	private String nombre;

}