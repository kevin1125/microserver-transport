package com.kevin.mantenimientos.manteniminetos;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Long> {
    // Métodos personalizados si los necesitas
}
