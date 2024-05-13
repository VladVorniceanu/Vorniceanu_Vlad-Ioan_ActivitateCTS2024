package classes;

public class StareSubObservatie implements Stare {
    @Override
    public void setState(Pacient pacient) {
        pacient.setState(this);
//        System.out.println("Pacientul " + pacient.getNume() + " este sub observatie");
    }
}
