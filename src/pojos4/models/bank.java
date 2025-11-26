package pojos4.models;

public class bank {
    public String getNombreBanco() {
        return NombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        NombreBanco = nombreBanco;
    }

    public String getCuentas() {
        return Cuentas;
    }

    public void setCuentas(String cuentas) {
        Cuentas = cuentas;
    }

    public bank(String cuentas, String nombreBanco) {
        Cuentas = cuentas;
        NombreBanco = nombreBanco;
    }

    private String NombreBanco;
    private String Cuentas;
}
