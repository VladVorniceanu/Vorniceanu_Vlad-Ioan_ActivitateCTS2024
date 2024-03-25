package Classes;

public class Medic extends PersonalSpital{
    public Medic(String nume, String mail) {
        super.nume = nume;
        super.mail = mail;
    }

    @Override
    public void descriereAngajat() {
        System.out.println("Anagajatul "
                + super.nume
                + " este MEDIC si are adresa de mail "
                + super.mail
                + "."
        );
    }
}
