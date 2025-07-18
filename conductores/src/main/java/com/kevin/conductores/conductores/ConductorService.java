package com.kevin.conductores.conductores;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorService {

    private final ConductorRepository conductorRepository;

    public ConductorService(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    public List<Conductor> findAll() {
        return conductorRepository.findAll();
    }

    public Optional<Conductor> findById(Long id) {
        return conductorRepository.findById(id);
    }

    public Conductor save(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    public void deleteById(Long id) {
        conductorRepository.deleteById(id);
    }
}