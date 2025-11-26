package org.tierno.pojos.models;

import java.util.Arrays;
import java.util.Objects;

public class Highschool {
    private Student[] students;
    private String name;

    public Highschool(Student[] students, String name) {
        this.students = students;
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Highschool that = (Highschool) o;
        return Objects.deepEquals(students, that.students) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(students), name);
    }

}
