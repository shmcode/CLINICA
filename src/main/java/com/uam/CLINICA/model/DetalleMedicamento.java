package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple", members="lote,vencimiento,presentacion,minimoExistencia;"
		+ "indicaciones;")

public class DetalleMedicamento extends Identificable{
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
	@DescriptionsList
	private Medicamento medicamento;
	
   private Date lote;

    private Date vencimiento;

    private String presentacion;

    @Stereotype("MEMO")
    private String indicaciones;

    private int minimoExistencia;

	
}

