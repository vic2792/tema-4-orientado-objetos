package Pojos3.models;

public class Biblioteca {
   private String nombre;

    public String[] getLibro() {
        return libro;
    }

    public void setLibro(String[] libro) {
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String [] libro;

    public Biblioteca(String nombre, String[] libro) {
        this.nombre = nombre;
        this.libro = libro;
    }
}
