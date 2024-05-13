package classes;

public class Persoana {
    private String nume;
    private int varsta;

    private boolean esteUrmaritDePolitie;
    private boolean areCreante;

    public Persoana(String nume, int varsta, boolean esteUrmaritDePolitie, boolean areCreante) {
        this.nume = nume;
        this.varsta = varsta;
        this.esteUrmaritDePolitie = esteUrmaritDePolitie;
        this.areCreante = areCreante;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isEsteUrmaritDePolitie() {
        return esteUrmaritDePolitie;
    }

    public boolean isAreCreante() {
        return areCreante;
    }
}
