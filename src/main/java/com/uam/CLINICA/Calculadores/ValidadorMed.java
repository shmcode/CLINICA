package com.uam.CLINICA.Calculadores;

import com.uam.CLINICA.model.Medicamento;
import com.uam.CLINICA.service.IDAO;
import com.uam.CLINICA.service.ImplDAO;
import org.openxava.util.Messages;
import org.openxava.validators.IPropertyValidator;

import java.util.List;

public class ValidadorMed implements IPropertyValidator {
    @Override
    public void validate(Messages messages, Object o, String s, String s1) throws Exception {
        IDAO dao = new ImplDAO();
        List<Medicamento> lista = dao.get("Medicamento.findByNombre", Medicamento.class, String.valueOf(o));
        if (lista != null && lista.size() > 0) {
            messages.add("El nombre del medicamento ya existe.");
        }
    }
}
