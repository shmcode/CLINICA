package com.uam.CLINICA.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
@NamedQueries(
		{
			@NamedQuery(name="Usuario.findByPassword",
						query="select e from Usuario e "
								+ "where e.usuario=?1 and e.password=?2")
		}
		)
public class Usuario {
	
	@Id
	private String id;
	
	private String usuario;
	
	private String password;

}
