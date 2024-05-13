package Classes;

public class Pacient {
//    Se analizeaza dificultataea starii pacientului
//    stare sanatate
//    se verifica disponibilitatea in saloanele spit
//    se emite fisa de internare
    private String nume;
    private int stareSanatate;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", stareSanatate=" + stareSanatate +
                '}';
    }
}
