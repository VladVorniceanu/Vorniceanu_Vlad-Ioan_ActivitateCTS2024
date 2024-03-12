package Classes.FabricaPersonal;

import Classes.*;

public class FabricaPersonal {
    public PersonalSpital createPersonalSpital( TipPersonal tipPersonal, String nume, int salariul) throws Exception {
        switch (tipPersonal) {
            case MEDIC:
                Medic medic = new Medic(salariul, nume);
                return medic;
            case ASISTENT:
                Asistent asistent = new Asistent(salariul, nume);
                return asistent;
            case BRANCARDIER:
                Brancardier brancardier = new Brancardier(salariul, nume);
                return brancardier;
            case INFIRMIER:
                return new Infirmier(salariul, nume);
            default: throw new Exception("Nu este un tip recunoscut");
        }
    }
}
