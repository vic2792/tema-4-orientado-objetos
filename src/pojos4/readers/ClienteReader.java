package pojos4.readers;

import pojos4.models.Cliente;

import java.util.Scanner;

public class ClienteReader {
    private final Scanner scanner;

    public ClienteReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Cliente read(){
        System.out.println("cual el nombre");
        String name = scanner.nextLine();

        System.out.println("cual es el apellido");
        String lastName = scanner.nextLine();

        System.out.println("cual es el nif");
        String nif = scanner.nextLine();
        return new Cliente(nif, name,lastName);
    }

}
