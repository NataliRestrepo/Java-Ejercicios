package main.java.com.example.Taller1;

public class MotoElectrica extends VehiculoElectrico{

    double distanciaRecorrida;
    double pasajeros;
    double costo = 100;

    public MotoElectrica(String marca, String modelo, String anio, double porcentajeBateria,
                         double capacidadBateria, double distanciaRecorrida, double pasajeros){
        super(marca,modelo,anio,porcentajeBateria,capacidadBateria);
        this.distanciaRecorrida=distanciaRecorrida;
        this.pasajeros=pasajeros;

    }

    @Override
    public double CalcularCostoViaje() {
        return distanciaRecorrida*(pasajeros*costo);
    }
}
