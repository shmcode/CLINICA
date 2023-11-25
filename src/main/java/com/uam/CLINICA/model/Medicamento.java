package com.uam.CLINICA.model;

import javax.persistence.*;

import com.uam.CLINICA.Calculadores.ValidadorMed;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@NamedQueries({
        @NamedQuery(name="Medicamento.findByNombre",query="select e from Medicamento e where e.nombre like ?1")
})
public class Medicamento extends Identificable {

    @PropertyValidator(value= ValidadorMed.class)
    @Required
    private String nombre;
	
    @Required
	private String nombreGenerico;

    @Required
	private Integer cantidadExistencia;

	//@OneToMany
	//@ReferenceView("Simple")
	//private Inventario detalleMedicamento;

}
