package com.uam.CLINICA.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

import java.util.Collection;
import java.util.Date;


@Entity
@Getter @Setter
//@View(members = "medicamento{medicamento}")
public class Inventario extends Identificable{

    /*private Date lote;

    private Date vencimiento;

    private String presentacion;

    @Stereotype("MEMO")
    private String indicaciones;

    private int minimoExistencia;*/

	/*@ManyToOne
    //@ReferenceView("Simple")
    private Medicamento medicamento;*/

}
