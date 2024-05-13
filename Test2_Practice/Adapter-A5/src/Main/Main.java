package Main;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Vitamina C");
        medicamentFarmacie.cumparaMedicament();

        IMedicamentFarmacie medicamentSpitalAdaptat = new AdapterMedicamente(new MedicamentSpital("Antibiotic"));
        medicamentSpitalAdaptat.cumparaMedicament();

    }
}