package com.uam.CLINICA.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
/*@View(name="Simple",members = "nombreComercial,nombreGenerico,cantidadExistencia,"
		+ "detalleMedicamento.lote,detalleMedica.vencimiento,detalleMedicamento.presentacion,"
		+ "detalleMedicamento.indicaciones")*/
@View(name="Simple", members = "nombreComercial")
public class Medicamento extends Identificable {
	
	@Column(length = 20)
    @Required
	private String nombreComercial;
	
	@Column(length = 20)
    @Required
	private String nombreGenerico;
	
	@Column(length = 20)
    @Required
	private int cantidadExistencia;
	
	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
	private DetalleMedicamento detalleMedicamento;
	
	

}
