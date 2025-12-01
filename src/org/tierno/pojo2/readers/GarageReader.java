package org.tierno.pojo2.readers;

import org.tierno.pojo2.models.Garage;
import org.tierno.pojo2.models.Vehicule;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehiculeReader vehiculeReader;

    public GarageReader(Scanner scanner, VehiculeReader vehiculeReader) {
        this.scanner = scanner;
        this.vehiculeReader = vehiculeReader;
    }
    public Garage read() {
        System.out.println("cual es el nombre del garage");
        String nombre = scanner.nextLine();

        System.out.println("cual es la direccion");
        String direccion = scanner.nextLine();

        System.out.println("cuantos vehiculos hay");
        int numb = scanner.nextInt();
        scanner.nextLine();

        Vehicule[] vehicules = new Vehicule[numb];
        for (int i = 0; i < vehicules.length; i++) {
            vehicules[i] = vehiculeReader.read();
        }
        return new Garage(nombre, direccion, vehicules);
    }
}
