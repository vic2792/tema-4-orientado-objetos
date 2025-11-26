package org.tierno.pojos.readers;

import org.tierno.pojos.models.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Student read () {
        System.out.println("introduce los datos del estudiante");

        System.out.println("nombre");
        String name = scanner.nextLine();

        System.out.println("apellidos");
        String surname = scanner.nextLine();

        System.out.println("direccion");
        String address = scanner.nextLine();
// Student
        return new Student(name, surname, address);
//        Student student = studentReader.read();
//        return student;
    }
}
