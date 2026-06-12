package main.java.com.example.Taller1;

public class Auto extends Vehiculo {
    double distancia;

    public Auto(String marca, String modelo, String anio, double distancia) {
        super(marca, modelo, anio);
        this.distancia=distancia;
    }

    @Override
    public double CalcularCostoViaje() {
        return 300*distancia;
    }
}
