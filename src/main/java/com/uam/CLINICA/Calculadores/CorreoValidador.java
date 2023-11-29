package com.uam.CLINICA.Calculadores;
import org.openxava.validators.*;
import org.openxava.util.*;

public class CorreoValidador implements IPropertyValidator{
    @Override
    public void validate(Messages messages, Object o, String s, String s1) throws Exception{
        String correo = (String) o;
        if (correo == null || !correo.contains("@")) {
            messages.add("El correo debe contener el símbolo '@'.");
        }
    }
}
