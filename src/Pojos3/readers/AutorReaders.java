package Pojos3.readers;

import Pojos3.models.Autor;

import java.util.Scanner;

public class AutorReaders {
    private final Scanner scanner;

    public AutorReaders(Scanner scanner) {
        this.scanner = scanner;
    }
    public Autor read(){
        System.out.println("cual es el Nif");
        int nif = scanner.nextInt();
        scanner.nextLine();

        System.out.println("cual es el nombre");
        String name = scanner.nextLine();

        System.out.println("cual es el apellido");
        String lastName = scanner.nextLine();
        return new Autor(nif, lastName, name);
    }
}
