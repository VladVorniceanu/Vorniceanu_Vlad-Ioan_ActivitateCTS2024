package Classes;

public class Caracteristici {
    private Pozitie pozitie;
    private String culoareTricou;

    public Pozitie getPozitie() {
        return pozitie;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    public Caracteristici(Pozitie pozitie, String culoareTricou) {
        this.pozitie = pozitie;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozitie=" + pozitie +
                ", culoareTricou='" + culoareTricou + '\'' +
                '}';
    }
}
