package main.java.com.example.Taller2;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {

    private List<RecursoBibliografico> items = new ArrayList<>();

    public void agregarItem(RecursoBibliografico item){
        items.add(item);
    }
}
