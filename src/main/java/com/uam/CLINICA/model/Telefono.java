package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Telefono {

	//@Required
    private String identificadorPais;
	//@Required
    private String numeroTelefono;
}
