package Main;

import Classes.FabricaPersonal.FabricaPersonal;
import Classes.FabricaPersonal.TipPersonal;
import Classes.PersonalSpital;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try {
            PersonalSpital medic = fabricaPersonal.createPersonalSpital(TipPersonal.MEDIC, "Medic1", 6000);
            PersonalSpital asistent = fabricaPersonal.createPersonalSpital(TipPersonal.ASISTENT, "Asistent1", 4000);
            PersonalSpital brancardier = fabricaPersonal.createPersonalSpital(TipPersonal.BRANCARDIER, "Brancardier1", 2980);
            PersonalSpital infirmier = fabricaPersonal.createPersonalSpital(TipPersonal.INFIRMIER, "Un infirmier", 4381);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            infirmier.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
