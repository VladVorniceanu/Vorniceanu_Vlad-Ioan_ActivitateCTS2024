package Classes;

public class MedicamentSpital implements IMedicamentSpital {

    public String denumire;

    public MedicamentSpital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Achizitie medicament de spital.");
        this.prezintaReteta();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("\tSe verifica reteta pentru medicamentul " + this.denumire + ".");
    }

    @Override
    public String toString() {
        return "MedicamentSpital{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}

