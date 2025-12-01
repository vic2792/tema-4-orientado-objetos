package Pojos3.models;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private long ISBN;
    private String Titulo;
    private int año;
    private Autor[] autores;

    public Book(long ISBN, String titulo, int año, Autor[] autores) {
        this.ISBN = ISBN;
        Titulo = titulo;
        this.año = año;
        this.autores = autores;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN && año == book.año && Objects.equals(Titulo, book.Titulo) && Objects.deepEquals(autores, book.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, Titulo, año, Arrays.hashCode(autores));
    }
}
