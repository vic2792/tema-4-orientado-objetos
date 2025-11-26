package Pojos3.models;

import java.lang.reflect.Array;

public class Book {
    private long ISBN;

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Array[] getAutores() {
        return autores;
    }

    public void setAutores(Array[] autores) {
        this.autores = autores;
    }

    private String Titulo;
    private int año;
    private Array[] autores;

    public Book(long ISBN, String titulo, int año, Array[] autores) {
        this.ISBN = ISBN;
        Titulo = titulo;
        this.año = año;
        this.autores = autores;
    }
}
