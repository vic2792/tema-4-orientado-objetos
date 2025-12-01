package pojos4.readers;

import pojos4.models.Cliente;
import pojos4.models.Cuenta;

import java.util.Scanner;

public class CuentaReader {
    private final Scanner scanner;
    private final ClienteReader clienteReader;

    public CuentaReader(ClienteReader clienteReader, Scanner scanner) {
        this.clienteReader = clienteReader;
        this.scanner = scanner;
    }
    public Cuenta read(){
        System.out.println("dime tu IBAN");
        String iban = scanner.nextLine();

        System.out.println("dime tu saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("cuantos clientes tienes");
        int number = scanner.nextInt();
        scanner.nextLine();
        Cliente[] clientes = new Cliente[number];
        for (int i = 0; i < number; i++) {
            clientes[i] = clienteReader.read();
        }
        return new Cuenta(iban, saldo, clientes);
    }
}

