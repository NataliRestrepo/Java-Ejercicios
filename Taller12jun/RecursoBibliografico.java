package main.java.com.example.Taller2;

public abstract class RecursoBibliografico {
    String titulo;
    String autor;
    int anioPublicacion;

    public RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }

    public abstract String obtenerResumen();
}
