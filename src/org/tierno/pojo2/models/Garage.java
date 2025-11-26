package org.tierno.pojo2.models;

public class Garage {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(String vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Garage(String nombre, String vehiculos, String direccion) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        Direccion = direccion;
    }

    private String nombre;
    private String Direccion;
    private String vehiculos;
}
