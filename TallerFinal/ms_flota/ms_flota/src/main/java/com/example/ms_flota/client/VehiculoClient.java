package com.example.ms_flota.client;

import com.example.ms_flota.dto.Vehiculo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VehiculoClient {

    private final RestTemplate restTemplate =
            new RestTemplate();

    public Vehiculo obtenerVehiculo(Long id) {

        String url =
                "http://localhost:8081/vehiculos/" + id;

        return restTemplate.getForObject(
                url,
                Vehiculo.class);
    }
}
