package Classes;

public class Spitalizare {
    int nrSalon;
    int nrPat;
    int zileSpitalizare;
    String numeMedicSpecialist;
    String diagnostic;

    public Spitalizare(int nrSalon, int nrPat, int zileSpitalizare, String numeMedicSpecialist, String diagnostic) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.zileSpitalizare = zileSpitalizare;
        this.numeMedicSpecialist = numeMedicSpecialist;
        this.diagnostic = diagnostic;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getZileSpitalizare() {
        return zileSpitalizare;
    }

    public void setZileSpitalizare(int zileSpitalizare) {
        this.zileSpitalizare = zileSpitalizare;
    }

    public String getNumeMedicSpecialist() {
        return numeMedicSpecialist;
    }

    public void setNumeMedicSpecialist(String numeMedicSpecialist) {
        this.numeMedicSpecialist = numeMedicSpecialist;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
