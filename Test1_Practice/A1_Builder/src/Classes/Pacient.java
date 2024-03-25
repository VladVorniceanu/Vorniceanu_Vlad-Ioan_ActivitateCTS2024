package Classes;

public class Pacient {
    boolean hasNiceBed;
    boolean hasBreakfast;
    boolean hasSlippers;
    boolean hasBathRobe;
    String name;

    public Pacient(String name) {
        this.name = name;
        this.hasNiceBed = false;
        this.hasBreakfast = false;
        this.hasSlippers = false;
        this.hasBathRobe = false;
    }

    public boolean isHasNiceBed() {
        return hasNiceBed;
    }

    public void setHasNiceBed(boolean hasNiceBed) {
        this.hasNiceBed = hasNiceBed;
    }

    public boolean isHasBreakfast() {
        return hasBreakfast;
    }

    public void setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }

    public boolean isHasSlippers() {
        return hasSlippers;
    }

    public void setHasSlippers(boolean hasSlippers) {
        this.hasSlippers = hasSlippers;
    }

    public boolean isHasBathRobe() {
        return hasBathRobe;
    }

    public void setHasBathRobe(boolean hasBathRobe) {
        this.hasBathRobe = hasBathRobe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pacientul " +
                ", name='" + name + '\'' +
                " hasNiceBed=" + hasNiceBed + '\'' +
                " hasBreakfast=" + hasBreakfast + '\'' +
                " hasSlippers=" + hasSlippers + '\'' +
                " hasBathRobe=" + hasBathRobe + '\'';
    }
}
