package Builder.classes;

import java.sql.ConnectionBuilder;

public class PacientBuilder implements Builder{
    @Override
    public Pacient build() {
        return this.pacient;
    }

    Pacient pacient;

    public PacientBuilder() {
        pacient = new Pacient(false, false, false, false);
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
