package com.kevin.vehiculos.vehiculos;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kevin.vehiculos.conductorDTO.ConductorDTO;


@RestController
@RequestMapping("/vehiculos")
@AllArgsConstructor
public class VehiculoController {

    private final VehiculoService vehiculoService;

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehiculo> findAll() {
        return vehiculoService.findAll();
    }

    // Obtener vehículo por ID
    @GetMapping("/{id}")
    public Vehiculo findById(@PathVariable("id") Long id) {
        return vehiculoService.findById(id).orElse(null);
    }

    // Crear nuevo vehículo
    @PostMapping
    public Vehiculo save(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.save(vehiculo);
    }

    // Eliminar vehículo por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        vehiculoService.deleteById(id);
    }

    // comunicar  con el micro servicio conductor 

    @GetMapping("/conductores/{id}")
    public ConductorDTO obteneConductorById(@PathVariable("id") Long id) {
           return vehiculoService.obteneConductorPorId(id);
    }
    
    
}