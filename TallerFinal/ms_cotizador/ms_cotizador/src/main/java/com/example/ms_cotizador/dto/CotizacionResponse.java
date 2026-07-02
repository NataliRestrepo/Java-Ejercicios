package com.example.ms_cotizador.dto;

public class CotizacionResponse {

    private Double costo;

    public CotizacionResponse() {
    }

    public CotizacionResponse(Double costo) {
        this.costo = costo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
