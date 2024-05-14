package Classes;

public class Persoana {
    String nume;
    boolean areAsigurare;

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", areAsigurare=" + areAsigurare +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    public Persoana(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }
}
