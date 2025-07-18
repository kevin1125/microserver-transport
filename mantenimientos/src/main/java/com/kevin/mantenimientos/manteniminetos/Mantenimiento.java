package com.kevin.mantenimientos.manteniminetos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
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
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "La descripción es obligatoria")
    private String descripcion; // texto

    @NotNull(message = "El costo es obligatorio")
    private Double costo; // numérico

    @NotNull(message = "La fecha de mantenimiento es obligatoria")
    @PastOrPresent(message = "La fecha no puede ser futura")
    private Date fechaRealizacion; // fecha

    @NotNull(message = "Indicar si está finalizado es obligatorio")
    private Boolean finalizado; // booleano
}
