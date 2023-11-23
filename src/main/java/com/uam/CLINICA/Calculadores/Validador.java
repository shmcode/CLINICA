package com.uam.CLINICA.Calculadores;

import org.openxava.validators.IPropertyValidator;
import com.uam.CLINICA.service.IDAO;
import com.uam.CLINICA.service.ImplDAO;
import com.uam.CLINICA.model.Sintomatologia;
import org.openxava.util.Messages;
import java.util.List;

public class Validador implements IPropertyValidator {
    @Override
    public void validate(Messages messages, Object o,String s, String s1) throws Exception{
        IDAO dao = new ImplDAO();
        List<Sintomatologia> lista = dao.get("Sintomatologia.findByNombre", Sintomatologia.class,String.valueOf(o));
        if (lista != null && lista.size() > 0) {
            messages.add("El nombre del sintoma ya existe");
        }

    }
}