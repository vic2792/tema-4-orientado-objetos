package org.tierno.pojo5.models;

import java.util.Objects;

public class Owner {
    private String nif;
    private String name;
    private String lastName;

    public Owner(String lastName, String name, String nif) {
        this.lastName = lastName;
        this.name = name;
        this.nif = nif;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nif, owner.nif) && Objects.equals(name, owner.name) && Objects.equals(lastName, owner.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastName);
    }
}
