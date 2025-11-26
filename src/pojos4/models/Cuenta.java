package pojos4.models;

public class Cuenta {
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Cuenta(double saldo, String IBAN, String cliente) {
        this.saldo = saldo;
        this.IBAN = IBAN;
        this.cliente = cliente;
    }

    private String IBAN;
    private double saldo;
    private String cliente;
}
