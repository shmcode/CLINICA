package com.uam.CLINICA.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass
@Getter @Setter

//Cambiado para que sea padre de Personal Clinica y Visitante - Shem 18/11 11:50

public class Configuracion {

    @Id
    @Column(length = 20)
    String identificacion; //cedula -- id

    @Column(length = 20)
    @Required
    String primerNombre;

    @Column(length = 20)
    @Required
    String primerApellido;
}
