package Pojos3.readers;

import Pojos3.models.Autor;
import Pojos3.models.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReaders autorReader;

    public BookReader(Scanner scanner, AutorReaders autorReader) {
        this.scanner = scanner;
        this.autorReader = autorReader;
    }
    public Book read (){
        System.out.println("cual es el ISBM");
        long isbm = scanner.nextLong();
        scanner.nextLine();

        System.out.println("cual es el titulo");
        String titulo = scanner.nextLine();

        System.out.println("cual es el año de publicacion");
        int numb = scanner.nextInt();
        scanner.nextLine();

        System.out.println("cuantos autores hay");
        int numb2 = scanner.nextInt();
        scanner.nextLine();

        Autor [] autors = new Autor[numb2];
        for (int i = 0; i < autors.length; i++) {
            autors[i] = autorReader.read();
        }
        return new Book(isbm, titulo, numb, autors);
    }

}
