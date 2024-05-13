package Classes;

public class SpitalPublic extends Template {
    private String numeSpital;
    private int numarPaturiLibere;

    public SpitalPublic(String numeSpital, int numarPaturiLibere) {
        this.numeSpital = numeSpital;
        this.numarPaturiLibere = numarPaturiLibere;
    }


    @Override
    protected void analizeazaSanatate(Pacient pacient) {
        pacient.setStareSanatate(pacient.getNume().length() % 5 + 1);
        System.out.println("Pacientul " + pacient.getNume() + " are starea de sanatate " + pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return this.numarPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        this.numarPaturiLibere--;
        System.out.println("Pacientul " + pacient.getNume() + " este internat in spitalul " + this.numeSpital);
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()
                + " este trimis la un alt spital deoarece in spitalul "
                + this.numeSpital + " nu mai sunt locuri disponibile.");
    }
}
