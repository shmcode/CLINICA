package com.uam.CLINICA.model;

import java.util.*;

import org.openxava.annotations.*;

import lombok.*;


@Getter @Setter

public class DetalleMedicamento extends Identificable {
	
	private Date lote;
	
	private Date vencimiento;
	
	private String presentacion;
	
	@Stereotype("MEMO")
	private String indicaciones;
	
	private int minimoExistencia;
	


}
