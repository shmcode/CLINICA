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
	
	//@Required
   private Date lote;

	//@Required
    private Date vencimiento;

	//@Required
    private String presentacion;

    @Stereotype("MEMO")
    private String indicaciones;
    
    @ElementCollection
  //  @ListProperties("")
    private Collection<Compra> compra;

	
}

