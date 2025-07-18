package com.kevin.conductores.conductores;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductores")
@AllArgsConstructor
public class ConductorController {

    private final ConductorService conductorService;

    // Obtener todos los conductores
    @GetMapping
    public List<Conductor> findAll() {
        return conductorService.findAll();
    }

    // Obtener conductor por ID
    @GetMapping("/{id}")
    public Conductor findById(@PathVariable("id") Long id) {
        return conductorService.findById(id).orElse(null);
    }

    // Crear nuevo conductor
    @PostMapping
    public Conductor save(@RequestBody Conductor conductor) {
        return conductorService.save(conductor);
    }

    // Eliminar conductor por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        conductorService.deleteById(id);
    }
}