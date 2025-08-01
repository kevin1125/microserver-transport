package com.kevin.conductores.conductores;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "El nombre es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre; 

    @Min(value = 18, message = "La edad mínima es 18 años")
    @Max(value = 75, message = "La edad máxima es 75 años")
    private int edad; 

    @NotNull(message = "La licencia activa es obligatoria")
    private Boolean licenciaActiva; 

    @Past(message = "La fecha debe ser pasada")
    private Date fechaIngreso; 
}
