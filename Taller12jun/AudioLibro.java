package main.java.com.example.Taller2;

public class AudioLibro extends RecursoDigital{
    int duracionM;

    public AudioLibro(String titulo, String autor, int anioPublicacion, String formato,
                      double tamanioMB, int duracionM) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.duracionM=duracionM;
    }
}
