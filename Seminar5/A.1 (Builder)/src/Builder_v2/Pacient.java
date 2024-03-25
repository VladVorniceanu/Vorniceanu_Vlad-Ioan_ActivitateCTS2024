package Builder_v2;

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

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halat=" + halat +
                '}';
    }

    public static class PacientBuilder implements Builder_v2.Builder{
        @Override
        public Builder_v2.Pacient build() {
            return this.pacient;
        }

        Builder_v2.Pacient pacient;

        public PacientBuilder() {
            this.setHalat(false);
            this.setPapuciDeCamera(false);
            this.setMicDejunInclus(false);
            this.setPatRabatabil(false);
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.pacient.setPatRabatabil(patRabatabil);
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.pacient.setMicDejunInclus(micDejunInclus);
            return this;
        }

        public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
            this.pacient.setPapuciDeCamera(papuciDeCamera);
            return this;
        }

        public PacientBuilder setHalat(boolean halat) {
            this.pacient.setHalat(halat);
            return this;
        }
    }
}


