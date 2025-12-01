package pojos4.readers;

import pojos4.models.Bank;
import pojos4.models.Cuenta;

import java.util.Scanner;

public class BankReader {
    private final Scanner scanner;
    private final ClienteReader clienteReader;
    private final CuentaReader cuentaReader;

    public BankReader(ClienteReader clienteReader, Scanner scanner, CuentaReader cuentaReader) {
        this.clienteReader = clienteReader;
        this.scanner = scanner;
        this.cuentaReader = cuentaReader;
    }
    public Bank read(){
        System.out.println("dame el nombre");
        String name = scanner.nextLine();

        System.out.println("cuantas cuentas tenes");
        int number = scanner.nextInt();
        scanner.nextLine();
        Cuenta[] cuentas = new Cuenta[number];
        for (int i = 0; i < number; i++) {
            cuentas[i] = cuentaReader.read();
        }
        return new Bank(cuentas,name);
    }
}
