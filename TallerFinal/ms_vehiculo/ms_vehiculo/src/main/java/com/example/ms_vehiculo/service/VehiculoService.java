package com.example.ms_vehiculo.service;

import com.example.ms_vehiculo.model.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculoService {

    private final List<Vehiculo> vehiculos = new ArrayList<>();

    public VehiculoService() {

        vehiculos.add(
                new Vehiculo(
                        1L,
                        "ABC123",
                        "Mazda",
                        "AUTO"));

        vehiculos.add(
                new Vehiculo(
                        2L,
                        "XYZ789",
                        "Yamaha",
                        "MOTO"));

        vehiculos.add(
                new Vehiculo(
                        3L,
                        "TES456",
                        "Tesla",
                        "ELECTRICO"));
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    public Vehiculo obtenerPorId(Long id) {

        return vehiculos.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Vehiculo guardarVehiculo(
            Vehiculo vehiculo) {

        vehiculos.add(vehiculo);

        return vehiculo;
    }
}
