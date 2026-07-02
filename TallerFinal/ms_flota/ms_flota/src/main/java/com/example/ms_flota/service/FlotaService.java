package com.example.ms_flota.service;

import com.example.ms_flota.client.CotizadorClient;
import com.example.ms_flota.client.CotizadorClient1;
import com.example.ms_flota.client.VehiculoClient;
import com.example.ms_flota.client.VehiculoClient1;
import com.example.ms_flota.dto.CotizacionRequest;
import com.example.ms_flota.dto.CotizacionResponse;
import com.example.ms_flota.dto.ResultadoFlota;
import com.example.ms_flota.dto.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlotaService {

    @Autowired
    private VehiculoClient1 vehiculoClient;

    @Autowired
    private CotizadorClient1 cotizadorClient;

    public ResultadoFlota obtenerCotizacion(
            Long vehiculoId,
            Double distancia) {

        Vehiculo vehiculo =
                vehiculoClient.obtenerVehiculo(
                        vehiculoId);

        CotizacionRequest request =
                new CotizacionRequest();

        request.setTipo(
                vehiculo.getTipo());

        request.setDistancia(
                distancia);

        CotizacionResponse respuesta =
                cotizadorClient.cotizar(request);

        ResultadoFlota resultado =
                new ResultadoFlota();

        resultado.setVehiculo(vehiculo);
        resultado.setCostoViaje(
                respuesta.getCosto());

        return resultado;
    }
}