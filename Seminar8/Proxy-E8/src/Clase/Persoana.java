package Clase;

public class Persoana {
    private String nume;
    private int varsta;
    private boolean isBarbat;

    public Persoana(String nume, int varsta, boolean isBarbat) {
        this.nume = nume;
        this.varsta = varsta;
        this.isBarbat = isBarbat;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isBarbat() {
        return isBarbat;
    }
}
