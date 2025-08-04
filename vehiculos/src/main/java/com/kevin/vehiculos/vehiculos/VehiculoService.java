package com.kevin.vehiculos.vehiculos;

import org.springframework.stereotype.Service;
import com.kevin.vehiculos.conductorDTO.ConductorDTO;
import com.kevin.vehiculos.conductorDTO.ConductorFeignApi;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;
    private final ConductorFeignApi conductorFeignApi;

    // ✅ Constructor con ambos argumentos
    public VehiculoService(VehiculoRepository vehiculoRepository, ConductorFeignApi conductorFeignApi) {
        this.vehiculoRepository = vehiculoRepository;
        this.conductorFeignApi = conductorFeignApi;
    }

    public List<Vehiculo> findAll() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> findById(Long id) {
        return vehiculoRepository.findById(id);
    }

    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void deleteById(Long id) {
        vehiculoRepository.deleteById(id);
    }

    // Comunicación con microservicio de conductores
    public ConductorDTO obteneConductorPorId(Long id) {
        return conductorFeignApi.BuscarConductorPorId(id);
    }
}
