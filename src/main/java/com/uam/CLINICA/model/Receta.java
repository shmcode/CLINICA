package com.uam.CLINICA.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Receta{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// que se muestre tipo receta 1, receta 2 etc... por pantalla pero no me funciona
    private Integer identificador;

    @ElementCollection
    @ListProperties("sintoma")
	private Collection<Sintomatologia> sintoma;

    /*@ManyToOne
    @ReferenceView("Simple")
    private Sintomatologia sintoma;*/
    
	@ManyToOne(fetch = FetchType.LAZY,
			optional = true)
    private Medicamento medicamento;

    @Column(length = 50)
    @Required
    private String cantidad;

    @Stereotype("MEMO")
    private String diagnostico;

    @Files
    @Column(length = 32) //fotos de sintomas opcional (ej: ronchas)
    private String foto;
}