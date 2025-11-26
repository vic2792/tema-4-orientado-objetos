package Pojos3.models;

public class autor {
    public int getNif() {
        return Nif;
    }

    public void setNif(int nif) {
        Nif = nif;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public autor(int nif, String apellidos, String nombres) {
        Nif = nif;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    private int Nif;
    private String nombres;
    private String apellidos;
}
