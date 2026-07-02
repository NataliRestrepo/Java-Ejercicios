package main.java.com.example.Taller2;

public class RecursoDigital extends RecursoBibliografico{

   String formato;
   double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion, String formato,
                          double tamanioMB) {
        super(titulo,autor,anioPublicacion);
        this.formato=formato;
        this.tamanioMB=tamanioMB;
    }

    @Override
    public String obtenerResumen() {
        return "";
    }
}
