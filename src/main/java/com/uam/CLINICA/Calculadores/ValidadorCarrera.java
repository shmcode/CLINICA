package com.uam.CLINICA.Calculadores;

import com.uam.CLINICA.model.Carrera;
import com.uam.CLINICA.service.IDAO;
import com.uam.CLINICA.service.ImplDAO;
import org.openxava.util.Messages;
import org.openxava.validators.IPropertyValidator;

import java.util.List;

public class ValidadorCarrera implements IPropertyValidator {
    @Override
    public void validate(Messages messages, Object o, String s, String s1) throws Exception {
        IDAO dao = new ImplDAO();
        List<Carrera> lista = dao.get("Carrera.findByNombre", Carrera.class, String.valueOf(o));
        if (lista != null && lista.size() > 0) {
            messages.add("Esta carrera ya fue creada anteriormente");
        }
    }
}
