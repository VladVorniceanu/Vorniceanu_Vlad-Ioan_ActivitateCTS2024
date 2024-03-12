package Classes;

public class Medic extends PersonalSpital {

    public Medic(float salariul, String nume) {
        super(salariul, nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Detalii Medic: \n\tsalariul: " + super.getSalariul() + "\n\tnumele: " + super.getNume());
    }
}
