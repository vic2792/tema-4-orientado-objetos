package org.tierno.pojo2.models;

public enum VehiculeType {
    motocycle("moto"), car("coche"), truck("camion");

    private final String description;

    VehiculeType(String description) {
        this.description = description;
    }
    public static VehiculeType fromIndex (int opt) {
        return VehiculeType.values() [opt];
    }
    public static void printMenu() {
        System.out.printf("elige una opcion");
        for (int i = 0; i < VehiculeType.values().length; i++) {
            System.out.println(i +"." +  VehiculeType.values()[i].description);
        }
    }
}
