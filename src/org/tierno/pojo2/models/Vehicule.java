package org.tierno.pojo2.models;

public class Vehicule {
    private String vehicule;

    public String getVehicule() {
        return vehicule;
    }

    public void setVehicule(String vehicule) {
        this.vehicule = vehicule;
    }

    public String getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public Vehicule(String vehicule, String velocidadMax, String color, String matricula) {
        this.vehicule = vehicule;
        this.velocidadMax = velocidadMax;
        Color = color;
        Matricula = matricula;
    }

    private String velocidadMax;
    private String Color;
    private String Matricula;
}

