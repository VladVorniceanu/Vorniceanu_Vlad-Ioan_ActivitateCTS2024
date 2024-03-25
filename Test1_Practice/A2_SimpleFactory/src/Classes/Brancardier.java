package Classes;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, String mail) {
        super.nume = nume;
        super.mail = mail;
    }

    @Override
    public void descriereAngajat() {
        System.out.println("Anagajatul "
                + super.nume
                + " este BRANCARDIER si are adresa de mail "
                + super.mail
                + "."
        );
    }
}
