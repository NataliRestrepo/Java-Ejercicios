package main.java.com.example.Taller1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main(){

    }

    public static void main(String[] args){
        List<Vehiculo> flota = new ArrayList<>();
        double menorCosto =Double.MAX_VALUE;
        Vehiculo mejorVehiculo = null;

        flota.add(new Auto("Toyota", "Corolla", "2020",50));

        flota.add(new AutoElectrico("Tesla", "Model3", "2026",
                80, 100,50));

        flota.add(new MotoElectrica("Yamaha", "R1Electrict", "2026",
                70, 100,50, 1));

        for (Vehiculo vehiculo: flota){
            double costo = vehiculo.CalcularCostoViaje();
            System.out.println("El costo de viaje en el vehiculo "+vehiculo.marca+
                    " "+vehiculo.modelo+" del año "+vehiculo.anio+" es: $"+costo);

            if (costo < menorCosto){
                menorCosto = costo;
                mejorVehiculo= vehiculo;

            }
        }

        System.out.println("El viaje más económico es "+mejorVehiculo.marca+
                " "+mejorVehiculo.modelo+" del año "+mejorVehiculo.anio+
                " con el valor de $"+menorCosto);
    }


}
