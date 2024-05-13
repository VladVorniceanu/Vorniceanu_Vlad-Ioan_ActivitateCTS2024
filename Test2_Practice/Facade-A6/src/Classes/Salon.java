package Classes;

public class Salon {
    int nrSalon;
    int nrPaturi;
    int nrPaturiOcupate;

    public Salon(int nrSalon, int nrPaturi, int nrPaturiOcupate) {
        this.nrSalon = nrSalon;
        this.nrPaturi = nrPaturi;
        this.nrPaturiOcupate = nrPaturiOcupate;
    }

    public boolean verificaLocSalon() {
        if( nrPaturiOcupate < nrPaturi ) {
            return ocupaLocSalon();
        } else {
            return false;
        }
    }

    public boolean ocupaLocSalon() {
        this.setNrPaturiOcupate( this.getNrPaturiOcupate() + 1);
        return true;
    }

    public int getNrPaturiOcupate() {
        return nrPaturiOcupate;
    }

    public void setNrPaturiOcupate(int nrPaturiOcupate) {
        this.nrPaturiOcupate = nrPaturiOcupate;
    }
}
