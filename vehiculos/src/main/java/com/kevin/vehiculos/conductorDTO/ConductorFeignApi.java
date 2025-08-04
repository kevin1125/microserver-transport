package com.kevin.vehiculos.conductorDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CONDUCTORES")
public interface ConductorFeignApi {
@GetMapping("/conductores/{id}")
ConductorDTO BuscarConductorPorId(@PathVariable("id") long id);
    
}
