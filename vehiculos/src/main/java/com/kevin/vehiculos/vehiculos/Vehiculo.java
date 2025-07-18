package com.kevin.vehiculos.vehiculos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
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
public class Vehiculo {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "La placa es obligatoria")
    @Size(min = 6, max = 10, message = "Debe tener entre 6 y 10 caracteres")
    private String placa;

    @NotNull(message = "El tipo es obligatorio")
    private String tipo; // Ejemplo: "Bus", "Camioneta"

    @Min(value = 1900, message = "El año mínimo permitido es 1900")
    @Max(value = 2100, message = "El año máximo permitido es 2100")
    private int anioFabricacion;

    private Boolean disponible;

    @PastOrPresent(message = "La fecha de ingreso no puede ser futura")
    private Date fechaIngreso;
}
