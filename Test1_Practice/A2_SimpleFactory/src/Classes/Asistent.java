package Classes;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, String mail) {
        super.nume = nume;
        super.mail = mail;
    }

    @Override
    public void descriereAngajat() {
        System.out.println("Anagajatul "
                + super.nume
                + " este ASISTENT si are adresa de mail "
                + super.mail
                + "."
        );
    }
}
