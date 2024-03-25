package Builder.classes;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halat;

    public Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halat = halat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halat=" + halat +
                '}';
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }
}
