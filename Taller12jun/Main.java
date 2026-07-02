package main.java.com.example.Taller2;

public class Main {
    public Main(){ }

    public static void main(String[] args){
        System.out.println("Talle 2: Busqueda de recurso bibliografico por antigüedad\n");

        LibroElectronico libro1 = new LibroElectronico("Cien años","Gabriel García",
                1991,"PDF",850,150,true);

        LibroElectronico libro2 = new LibroElectronico("Don Quijote","Miguel Cervantes",
                1960,"eBook",1030,1090,true);

        AudioLibro audioLibro1 = new AudioLibro("Harry Potter 1", "J. K. Rowling",
                1997,"",2500,750);




    }
}
