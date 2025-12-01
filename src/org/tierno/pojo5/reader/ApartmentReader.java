package org.tierno.pojo5.reader;

import org.tierno.pojo5.models.Apartment;
import org.tierno.pojo5.models.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(OwnerReader ownerReader, Scanner scanner) {
        this.ownerReader = ownerReader;
        this.scanner = scanner;
    }
    public Apartment read() {
        System.out.println("cual es tu planta");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("cual es tu puerta");
        String door = scanner.nextLine();

        System.out.println("cuantos propietarios hay");
        int count = scanner.nextInt();
        scanner.nextLine();

        Owner[] owners = new Owner[count];
        for (int i = 0; i < count; i++) {
            owners[i] = ownerReader.read();

        }
        return new Apartment(door, floor, owners);
    }
}
