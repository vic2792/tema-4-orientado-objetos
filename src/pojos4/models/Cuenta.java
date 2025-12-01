package pojos4.models;

import java.util.Arrays;
import java.util.Objects;

public class Cuenta {
    public Cuenta(String IBAN, double saldo, Cliente[] clientes) {
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.clientes = clientes;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Double.compare(saldo, cuenta.saldo) == 0 && Objects.equals(IBAN, cuenta.IBAN) && Objects.deepEquals(clientes, cuenta.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IBAN, saldo, Arrays.hashCode(clientes));
    }

    private String IBAN;
    private double saldo;
    private Cliente[] clientes;
}
