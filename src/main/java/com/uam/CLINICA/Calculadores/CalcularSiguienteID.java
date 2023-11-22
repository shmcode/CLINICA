package com.uam.CLINICA.Calculadores;

import javax.persistence.*;

import org.openxava.calculators.*;
import org.openxava.jpa.*;

import lombok.*;

public class CalcularSiguienteID implements ICalculator {
	
	@Getter @Setter
	int id;
	
	@Override
	public Object calculate() throws Exception {
		Query query = XPersistence.getManager()
				.createQuery("select max(v.numero) from Visita v where v.id = :id");
		query.setParameter("id",id);
		Integer ultimoID = (Integer) query.getSingleResult();
		return ultimoID == null ? 1 : ultimoID + 1;
	}
	

}
