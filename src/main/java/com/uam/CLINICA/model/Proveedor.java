
package com.uam.CLINICA.model;
import java.util.*;
import javax.persistence.*;
import com.uam.CLINICA.Calculadores.ValidadorProveedor;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@NamedQueries({
        @NamedQuery(name="Proveedor.findByNombre",query="select e from Proveedor e where e.nombre like ?1")
})
@View(name="Simple",members = "nombreProveedor,compania")
public class Proveedor extends Identificable{

    @Column(length = 20)
    @PropertyValidator(value= ValidadorProveedor.class)
    @Required
    private String nombre;

    @Column(length = 20)
    @Required
    String compania;

	@ElementCollection
    @ListProperties("correo")
	private Collection<Correo> correo;


}
