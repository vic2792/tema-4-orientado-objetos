package org.tierno.pojo5.reader;

import org.tierno.pojo5.models.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Owner read(){
        System.out.println("cual es tu nombre");
        String name = scanner.nextLine();

        System.out.println("cual es tu nif");
        String nif = scanner.nextLine();

        System.out.println("cual es tu apellido");
        String lastName = scanner.nextLine();

        return new Owner(lastName,name, nif);
    }
}
