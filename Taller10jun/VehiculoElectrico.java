package main.java.com.example.Taller1;

public abstract class VehiculoElectrico extends Vehiculo {

    private double porcentajeBateria;
    private double capacidadBateria;

    public VehiculoElectrico(String marca, String modelo, String anio, double porcentajeBateria,
                             double capacidadBateria) {
        super(marca, modelo, anio);
        this.porcentajeBateria=porcentajeBateria;
        this.capacidadBateria=capacidadBateria;
    }
}
