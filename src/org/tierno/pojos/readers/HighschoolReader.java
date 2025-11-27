package org.tierno.pojos.readers;

import org.tierno.pojos.models.Highschool;
import org.tierno.pojos.models.Student;

import java.util.Scanner;

public class HighschoolReader {
    private final  Scanner scanner;
    private final StudentReader studentReader;

    public HighschoolReader(Scanner scanner, StudentReader studentReader) {
        this.scanner = scanner;
        this.studentReader = studentReader;
    }
    public Highschool read() {
        System.out.println ("name");
        String name = scanner.nextLine();

        System.out.println("cuantos estudiantes tienes:");
        int number = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[number];
        for (int i = 0; i < number; i++) {
            System.out.println("introduce los datos del estudiantes que molan");
            students [i] = studentReader.read();
        }
        return new Highschool(students, name);
    }
}
