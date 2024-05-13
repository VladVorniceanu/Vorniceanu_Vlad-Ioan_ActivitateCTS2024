package Classes;

public class Medic {
    String numeMedic;
    Spital spital;

    public Medic(String numeMedic, Spital spital) {
        this.numeMedic = numeMedic;
        this.spital = spital;
    }

    public boolean verificaPacient(Pacient pacient) {
        return pacient.getGradImbolnavire() > 4;
    }

    public Spital getSpital() {
        return spital;
    }
}

