package com.example.ms_flota.dto;

public class CotizacionRequest {

    private String tipo;
    private Double distancia;

    public CotizacionRequest() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
}