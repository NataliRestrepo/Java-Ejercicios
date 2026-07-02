package com.example.ms_vehiculo.model;

public class Vehiculo {

    private Long id;
    private String placa;
    private String marca;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String placa, String marca, String tipo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}