package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;


@Entity
@Getter @Setter
//@View(members = "medicamento{medicamento}")
public class Inventario extends Identificable{

 

	/*@ManyToOne
    //@ReferenceView("Simple")
    private Medicamento medicamento;*/

}
