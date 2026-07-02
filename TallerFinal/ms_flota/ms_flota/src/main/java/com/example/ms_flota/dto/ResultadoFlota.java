package com.example.ms_flota.dto;

public class ResultadoFlota {

    private Vehiculo vehiculo;
    private Double costoViaje;

    public ResultadoFlota() {
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Double getCostoViaje() {
        return costoViaje;
    }

    public void setCostoViaje(Double costoViaje) {
        this.costoViaje = costoViaje;
    }
}