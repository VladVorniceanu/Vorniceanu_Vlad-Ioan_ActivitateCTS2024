package Classes;

public class ProxyInternare implements IInternare{

    Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }
    public ProxyInternare(Persoana pacient) {
        this.internare = new Internare(pacient);
    }

    @Override
    public void internare() {
        if(internare.getPacient().isAreAsigurare()) {
            internare.internare();
        } else {
            System.out.println("Pacientul " + internare.getPacient().getNume() + " nu poate fi internat deoarece nu are asigurare de sanatate.");
        }
    }
}
