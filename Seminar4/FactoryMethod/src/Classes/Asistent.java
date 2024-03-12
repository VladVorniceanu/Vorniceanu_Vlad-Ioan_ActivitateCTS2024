package Classes;

public class Asistent extends PersonalSpital {

    public Asistent(float salariul, String nume) {
        super(salariul, nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Detalii Asistent: \n\tsalariul: " + super.getSalariul() + "\n\tnumele: " + super.getNume());
    }
}
