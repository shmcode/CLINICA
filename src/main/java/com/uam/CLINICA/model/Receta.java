package com.uam.CLINICA.model;

import javax.persistence.*;
import javax.persistence.Entity;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
/*@View(members = 
		"sintomatologia, medicamento, cantidad;" +
		"diagnostico;" +
		"foto;"
		)*/
public class Receta extends Identificable{

    @ManyToOne
    @DescriptionsList
    private Sintomatologia sintomatologia;
    
    @ManyToOne(
    		fetch = FetchType.LAZY,	
    		optional = true)
    @DescriptionsList
    private Medicamento medicamento;

    @Column(length = 50)
    @Required
    private String cantidad;

    @Stereotype("MEMO")
    private String diagnostico;
/*
    @Files
    @Column(length = 32) //fotos de sintomas opcional (ej: ronchas)
    private String foto;*/
}
