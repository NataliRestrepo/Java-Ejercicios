package main.java.com.example.Taller1;

public class AutoElectrico extends VehiculoElectrico{

    double costo=350;
    double distancia;

    public AutoElectrico(String marca, String modelo, String anio,
                         double porcentajeBateria,
                         double capacidadBateria,
                         double distancia){
        super(marca,modelo,anio,porcentajeBateria,capacidadBateria);
        this.distancia=distancia;

    }

    @Override
    public double CalcularCostoViaje() {

        return (distancia*costo)*0.9;
    }
}
