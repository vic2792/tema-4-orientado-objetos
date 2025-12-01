package pojos4.models;

import java.util.Arrays;
import java.util.Objects;

public class Bank {
    private String nombreBanco;
    private Cuenta[] cuentas;

    public Bank(Cuenta[] cuentas, String nombreBanco) {
        this.cuentas = cuentas;
        this.nombreBanco = nombreBanco;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(nombreBanco, bank.nombreBanco) && Objects.deepEquals(cuentas, bank.cuentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreBanco, Arrays.hashCode(cuentas));
    }
}
