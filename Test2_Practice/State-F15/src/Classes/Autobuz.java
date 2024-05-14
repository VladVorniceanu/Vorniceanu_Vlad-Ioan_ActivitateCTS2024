package Classes;

public class Autobuz {
    private State state;
    private int nrAutobuz;

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Autobuz(State state, int nrAutobuz) {
        this.state = state;
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa() {
        if(this.state instanceof LaCapatDeLinie) {
            State inCursa = new InCursa();
            inCursa.setState(this);
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " a plecat in cursa.");
        } else if(this.state instanceof LaReparat) {
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " nu este reparat ca sa poata pleca in cursa.");
        } else {
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " nu este la capat de linie ca sa plece in cursa.");
        }
    }

    public void terminaCursa() {
        if(this.state instanceof InCursa) {
            State laCapat = new LaCapatDeLinie();
            laCapat.setState(this);
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " a ajuns la capatul de linie.");
        } else {
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " nu este in cursa ca sa ajunga la capat de linie");
        }
    }

    public void repara() {
        if(!(this.state instanceof LaReparat)) {
            State laReparat = new LaReparat();
            laReparat.setState(this);
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " este la reparat.");
        } else {
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " este deja la reparat");
        }
    }

    public void finalizeazaReparatie() {
        if(this.state instanceof LaReparat) {
            State laCapat = new LaCapatDeLinie();
            laCapat.setState(this);
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " a fost reparat si a ajuns la capatul de linie.");
        } else {
            System.out.println("Autobuzul nr " + this.getNrAutobuz() + " nu este la reparat ca sa fie reparat.");
        }
    }

}
