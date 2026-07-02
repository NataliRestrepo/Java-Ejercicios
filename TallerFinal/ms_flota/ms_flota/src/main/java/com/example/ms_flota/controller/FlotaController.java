package com.example.ms_flota.controller;

import com.example.ms_flota.client.CotizadorClient;
import com.example.ms_flota.client.CotizadorClient1;
import com.example.ms_flota.client.VehiculoClient;
import com.example.ms_flota.dto.ResultadoFlota;
import com.example.ms_flota.dto.Vehiculo;
import com.example.ms_flota.service.FlotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flotas")
public class FlotaController {

    @Autowired
    private FlotaService flotaService;

    @GetMapping("/{vehiculoId}/{distancia}")
    public ResultadoFlota obtenerCotizacion(
            @PathVariable Long vehiculoId,
            @PathVariable Double distancia) {

        return flotaService.obtenerCotizacion(
                vehiculoId,
                distancia);
    }
}