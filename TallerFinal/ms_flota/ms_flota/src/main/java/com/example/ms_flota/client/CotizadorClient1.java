package com.example.ms_flota.client;

import com.example.ms_flota.dto.CotizacionRequest;
import com.example.ms_flota.dto.CotizacionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "COTIZADOR-SERVICE")
public interface CotizadorClient1 {

    @GetMapping("*/api/cotizar")
    double CalcularCosto(@RequestParam String tipoVehiculo, @RequestParam double km);

    @PostMapping("/cotizar")
    CotizacionResponse cotizar(
            @RequestBody CotizacionRequest request);
}
