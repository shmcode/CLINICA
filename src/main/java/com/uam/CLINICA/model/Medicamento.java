package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter

public class Medicamento extends Identificable {
	
    //@Required
	private String nombre;
	
    //@Required
	private String nombreGenerico;
    
    //@Required
	private Integer cantidadExistencia;

}