package Classes.Factory;

import Classes.Infirmier;
import Classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal {

    @Override
    public PersonalSpital createPersonal(String nume, int salariul) {
        return new Infirmier(salariul, nume);
    }
}
