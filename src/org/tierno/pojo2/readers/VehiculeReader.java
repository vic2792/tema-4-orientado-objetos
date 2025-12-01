package org.tierno.pojo2.readers;

import org.tierno.pojo2.models.Vehicule;
import org.tierno.pojo2.models.VehiculeType;

import java.util.Scanner;

public class VehiculeReader {
    private final Scanner scanner;

    public VehiculeReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Vehicule read () {
        System.out.println("cual es la velocidad max");
        String velocidadmax = scanner.nextLine();

        System.out.println("cual es el tipo de vehiculo");
        VehiculeType vehiculetype = tipoVehiculo();

        System.out.println("cual es el color");
        String color = scanner.nextLine();

        System.out.printf("cual es la matricula");
        String matricula = scanner.nextLine();
        return new Vehicule(vehiculetype, velocidadmax, color, matricula);
    }
    private VehiculeType tipoVehiculo () {
        VehiculeType opt;
        do {
            VehiculeType.printMenu();
            opt = VehiculeType.fromIndex(scanner.nextInt());
            scanner.nextLine();
        }while (opt==null);
        return opt;
    }
}
