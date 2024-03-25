package Classes;

public class Asistent extends Personal {

    public Asistent(String nume, String mail) {
        super.nume = nume;
        super.mail = mail;
    }

    @Override
    public String toString() {
        return "Anagajatul "
                + super.nume
                + " este ASISTENT si are adresa de mail "
                + super.mail
                + ".\n";
    }
}
