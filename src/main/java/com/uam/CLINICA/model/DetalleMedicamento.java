package com.uam.CLINICA.model;

import java.util.*;

import org.openxava.annotations.*;

import lombok.*;

import javax.persistence.*;

@Embeddable
@Getter @Setter

public class DetalleMedicamento {

	@OneToOne(fetch = FetchType.LAZY,optional = false)
	private Inventario inventario;
}

