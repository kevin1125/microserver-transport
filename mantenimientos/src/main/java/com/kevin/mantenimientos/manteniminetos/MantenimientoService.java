package com.kevin.mantenimientos.manteniminetos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MantenimientoService {

    private final MantenimientoRepository mantenimientoRepository;

    public MantenimientoService(MantenimientoRepository mantenimientoRepository) {
        this.mantenimientoRepository = mantenimientoRepository;
    }

    public List<Mantenimiento> findAll() {
        return mantenimientoRepository.findAll();
    }

    public Optional<Mantenimiento> findById(Long id) {
        return mantenimientoRepository.findById(id);
    }

    public Mantenimiento save(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    public void deleteById(Long id) {
        mantenimientoRepository.deleteById(id);
    }
}