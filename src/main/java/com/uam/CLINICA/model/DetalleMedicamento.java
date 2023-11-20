package com.uam.CLINICA.model;

import java.util.*;

import org.openxava.annotations.*;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Getter @Setter

public class DetalleMedicamento extends Identificable {
	
	private Date lote;
	
	private Date vencimiento;
	
	private String presentacion;
	
	@Stereotype("MEMO")
	private String indicaciones;
	
	private int minimoExistencia;
	


}
