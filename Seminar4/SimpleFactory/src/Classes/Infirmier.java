package Classes;

public class Infirmier extends PersonalSpital {

    public Infirmier(float salariul, String nume) {
        super(salariul, nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Detalii Brancardier: \n\tsalariul: " + super.getSalariul() + "\n\tnumele: " + super.getNume());
    }
}
