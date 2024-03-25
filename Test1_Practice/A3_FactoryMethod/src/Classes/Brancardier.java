package Classes;

public class Brancardier extends Personal {
    public Brancardier(String nume, String mail) {
        super.nume = nume;
        super.mail = mail;
    }

    @Override
    public String toString() {
        return "Anagajatul "
                + super.nume
                + " este BRANCARDIER si are adresa de mail "
                + super.mail
                + ".\n";
    }
}
