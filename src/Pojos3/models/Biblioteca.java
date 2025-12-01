package Pojos3.models;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
   private String nombre;
   private Book[] books;

    public Biblioteca(String nombre, Book[] books) {
        this.nombre = nombre;
        this.books = books;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Objects.deepEquals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Arrays.hashCode(books));
    }
}
