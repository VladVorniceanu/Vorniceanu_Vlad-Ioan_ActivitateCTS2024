package Classes;

public class PacientBuilder implements AbstractBuilder{

    Pacient pacient;

    public PacientBuilder(String pacientName) {
        this.pacient = new Pacient(pacientName);
    }

    public PacientBuilder setHasNiceBed(boolean hasNiceBed) {
        this.pacient.hasNiceBed = hasNiceBed;
        return this;
    }

    public PacientBuilder setHasBreakfast(boolean hasBreakfast) {
        this.pacient.hasBreakfast = hasBreakfast;
        return this;
    }

    public PacientBuilder setHasSlippers(boolean hasSlippers) {
        this.pacient.hasSlippers = hasSlippers;
        return this;
    }

    public PacientBuilder setHasBathRobe(boolean hasBathRobe) {
        this.pacient.hasBathRobe = hasBathRobe;
        return this;
    }

    public PacientBuilder setName(String name) {
        this.pacient.name = name;
        return this;
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }
}
