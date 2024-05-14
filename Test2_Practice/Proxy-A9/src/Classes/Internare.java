package Classes;

public class Internare implements IInternare{

    private Persoana pacient;

    public Internare(Persoana pacient) {
        this.pacient = pacient;
    }

    public Persoana getPacient() {
        return pacient;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + pacient.nume + " a fost internat cu asigurare de sanatate.");
    }
}
