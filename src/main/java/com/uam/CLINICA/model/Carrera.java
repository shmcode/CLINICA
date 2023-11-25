package com.uam.CLINICA.model;

import javax.persistence.*;

import com.uam.CLINICA.Calculadores.ValidadorCarrera;
import com.uam.CLINICA.Calculadores.ValidadorMed;
import lombok.*;
import org.openxava.annotations.PropertyValidator;

@Entity
@Getter
@Setter
@NamedQueries({
		@NamedQuery(name="Carrera.findByNombre",query="select e from Carrera e where e.nombre like ?1")
})
public class Carrera extends Identificable{
	
	//@Required
	private String facultad;
	
	//@Required
	@PropertyValidator(value= ValidadorCarrera.class)
	private String nombre;

}
