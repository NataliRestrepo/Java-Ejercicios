package com.example.ms_vehiculo.controller;

import com.example.ms_vehiculo.model.Vehiculo;
import com.example.ms_vehiculo.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public List<Vehiculo> listarVehiculos() {

        return vehiculoService.listarVehiculos();
    }

    @GetMapping("/{id}")
    public Vehiculo buscarVehiculo(
            @PathVariable Long id) {

        return vehiculoService.obtenerPorId(id);
    }

    @PostMapping
    public Vehiculo guardarVehiculo(
            @RequestBody Vehiculo vehiculo) {

        return vehiculoService.guardarVehiculo(
                vehiculo);
    }
}




