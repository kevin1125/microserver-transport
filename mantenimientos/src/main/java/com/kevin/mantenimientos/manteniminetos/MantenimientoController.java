package com.kevin.mantenimientos.manteniminetos;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mantenimientos")
@AllArgsConstructor
public class MantenimientoController {

    private final MantenimientoService mantenimientoService;

    // Obtener todos los mantenimientos
    @GetMapping
    public List<Mantenimiento> findAll() {
        return mantenimientoService.findAll();
    }

    // Obtener mantenimiento por ID
    @GetMapping("/{id}")
    public Mantenimiento findById(@PathVariable("id") Long id) {
        return mantenimientoService.findById(id).orElse(null);
    }

    // Crear nuevo mantenimiento
    @PostMapping
    public Mantenimiento save(@RequestBody Mantenimiento mantenimiento) {
        return mantenimientoService.save(mantenimiento);
    }

    // Eliminar mantenimiento por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        mantenimientoService.deleteById(id);
    }
}