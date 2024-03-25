package Classes;

public class Medic extends Personal{
    public Medic(String nume, String mail) {
        super.nume = nume;
        super.mail = mail;
    }

    @Override
    public String toString() {
        return "Anagajatul "
                + super.nume
                + " este MEDIC si are adresa de mail "
                + super.mail
                + ".\n";
    }
}
