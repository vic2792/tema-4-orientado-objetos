package Pojos3.readers;

import Pojos3.models.Biblioteca;
import Pojos3.models.Book;

import java.util.Scanner;

public class BibliotecaReader {
    private final Scanner scanner;
    private final AutorReaders autorReaders;
    private final BookReader bookReader;

    public BibliotecaReader(Scanner scanner, AutorReaders autorReaders, BookReader bookReader) {
        this.scanner = scanner;
        this.autorReaders = autorReaders;
        this.bookReader = bookReader;
    }
    public Biblioteca read () {
        System.out.println("dime el nombre");
        String name = scanner.nextLine();

        System.out.println("cuantos libros");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n1];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        } return new Biblioteca(name, books);
    }
}
