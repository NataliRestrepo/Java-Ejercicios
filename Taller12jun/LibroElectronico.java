package main.java.com.example.Taller2;

public class LibroElectronico extends RecursoDigital{
    int numeroPaginas;
    boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion,
                            String formato, double tamanioMB,
                            int numeroPaginas, boolean tieneDRM){
        super(titulo,autor,anioPublicacion,formato,tamanioMB);
        this.numeroPaginas=numeroPaginas;
        this.tieneDRM=tieneDRM;

    }
}
