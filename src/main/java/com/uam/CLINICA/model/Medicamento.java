package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple", members="nombre,nombreGenerico;"
		+ "cantidadExistencia;"
		+ "detalleMedicamento;")
public class Medicamento extends Identificable {
	
    //@Required
	private String nombre;
	
    //@Required
	private String nombreGenerico;
    
    //@Required
	private Integer cantidadExistencia;
	
	@OneToMany(mappedBy="medicamento", cascade=CascadeType.REMOVE)
	private List<DetalleMedicamento> detalleMedicamento;
	

}
