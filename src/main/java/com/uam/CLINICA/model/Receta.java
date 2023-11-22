import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
/*@View(members = 
		"sintomatologia, medicamento, cantidad;" +
		"diagnostico;" +
		"foto;"
		)*/
public class Receta{

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")// que se muestre tipo receta 1, receta 2 etc... por pantalla pero no me funciona
    private String identificador;

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
