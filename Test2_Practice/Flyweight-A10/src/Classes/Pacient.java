package Classes;

public class Pacient implements IPacient{

    String nume;
    String telefon;
    String adresa;
    int varsta;

    public Pacient(String nume, String telefon, String adresa, int varsta) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    @Override
    public void descriePacient(Spitalizare spitalizare) {
        System.out.println("Pacientul " + this.nume +
                ", tel: " + this.telefon +
                ", adresa: " + this.adresa +
                ", in varsta de " + this.varsta +
                " ani, este internat in salonul " + spitalizare.getNrSalon() +
                ", patul " + spitalizare.getNrPat() +
                ", sta internat de " + spitalizare.getZileSpitalizare() +
                " zile, este la medicul " + spitalizare.getNumeMedicSpecialist() +
                " si sufera de " + spitalizare.diagnostic);
    }
}
