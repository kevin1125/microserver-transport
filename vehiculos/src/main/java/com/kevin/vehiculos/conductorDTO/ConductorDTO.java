package com.kevin.vehiculos.conductorDTO;

import java.util.Date;


import lombok.Data;

@Data
public class ConductorDTO {
    
    private Long id;
    private String nombre; 
    private int edad; 
    private Boolean licenciaActiva; 
    private Date fechaIngreso; 
}
