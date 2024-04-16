package Classes;

public class Spectator implements IFlyweight {
    private int inaltime;
    private int latime;

    public Spectator(int inaltime, int latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getLatime() {
        return latime;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "inaltime=" + inaltime +
                ", latime=" + latime +
                '}';
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public void deseneazaPersoana(Caracteristici optionale) {
        System.out.println(this.toString() + optionale.toString());
    }
}
