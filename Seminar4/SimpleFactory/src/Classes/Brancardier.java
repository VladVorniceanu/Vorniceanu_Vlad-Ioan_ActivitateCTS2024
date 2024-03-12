package Classes;

public class Brancardier extends PersonalSpital {

    public Brancardier(float salariul, String nume) {
        super(salariul, nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Detalii Brancardier: \n\tsalariul: " + super.getSalariul() + "\n\tnumele: " + super.getNume());
    }
}
