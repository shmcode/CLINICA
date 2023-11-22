package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;


@Entity
@Getter
@Setter

public class Sintomatologia extends Identificable{

	//@Required
	private String nombre;

}
