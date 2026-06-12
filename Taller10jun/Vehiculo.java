package main.java.com.example.Taller1;

public abstract class Vehiculo {
    String marca;
    String modelo;
    String anio;


    public Vehiculo(String marca, String modelo, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public abstract double CalcularCostoViaje();
}
