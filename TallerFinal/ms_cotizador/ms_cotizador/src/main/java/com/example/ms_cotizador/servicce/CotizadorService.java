package com.example.ms_cotizador.servicce;

import org.springframework.stereotype.Service;

@Service
public class CotizadorService {

    public Double calcularCosto(
            String tipo,
            Double distancia) {

        double tarifa;

        switch (tipo.toUpperCase()) {

            case "AUTO":
                tarifa = 1000;
                break;

            case "MOTO":
                tarifa = 500;
                break;

            case "ELECTRICO":
                tarifa = 700;
                break;

            default:
                tarifa = 0;
        }

        return tarifa * distancia;
    }
}
