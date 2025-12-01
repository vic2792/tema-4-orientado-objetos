package org.tierno.pojo2.models;

import java.util.Objects;

public class Vehicule {
    private VehiculeType vehicule;
    private String velocidadMax;
    private String color;
    private String matricula;

    public Vehicule(VehiculeType vehicule, String velocidadMax, String color, String matricula) {
        this.vehicule = vehicule;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.matricula = matricula;
    }

    public VehiculeType getVehicule() {
        return vehicule;
    }

    public void setVehicule(VehiculeType vehicule) {
        this.vehicule = vehicule;
    }

    public String getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule1 = (Vehicule) o;
        return vehicule == vehicule1.vehicule && Objects.equals(velocidadMax, vehicule1.velocidadMax) && Objects.equals(color, vehicule1.color) && Objects.equals(matricula, vehicule1.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicule, velocidadMax, color, matricula);
    }
}

