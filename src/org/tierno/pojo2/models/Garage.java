package org.tierno.pojo2.models;

import java.util.Arrays;
import java.util.Objects;

public class Garage {


    private String nombre;
    private String Direccion;
    private Vehicule[] vehiculos;

    public Garage(String direccion, String nombre, Vehicule[] vehiculos) {
        Direccion = direccion;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Vehicule[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehicule[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(nombre, garage.nombre) && Objects.equals(Direccion, garage.Direccion) && Objects.deepEquals(vehiculos, garage.vehiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Direccion, Arrays.hashCode(vehiculos));
    }
}
