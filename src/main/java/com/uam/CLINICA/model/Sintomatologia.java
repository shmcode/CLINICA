package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;


@Entity
@Getter
@Setter

public class Sintomatologia extends Identificable{
	private String nombre; //sintoma solo se escriba en minusculas
	@PrePersist //Ejecutado justo antes de grabar el objeto por primera vez
	private void onPersist() throws Exception{
		this.setNombre(nombre.toLowerCase());
	}

	@PreUpdate //Ejecutado al momento de actualizar posteriormente la entidad
	private void onUpdate() throws Exception{
		this.setNombre(nombre.toLowerCase());
	}

}
