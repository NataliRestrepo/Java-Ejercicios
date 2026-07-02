package com.example.ms_flota.client;

import com.example.ms_flota.dto.Vehiculo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="VEHICULO-SERVICE")
public interface VehiculoClient1 {
    @GetMapping("/vehiculos/{id}")
    Vehiculo obtenerVehiculo(
            @PathVariable Long id
    );
}
