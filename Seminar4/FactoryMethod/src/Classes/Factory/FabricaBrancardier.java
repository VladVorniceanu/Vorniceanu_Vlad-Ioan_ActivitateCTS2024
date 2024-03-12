package Classes.Factory;

import Classes.Brancardier;
import Classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal{

    @Override
    public PersonalSpital createPersonal(String nume, int salariul) {
        return new Brancardier(salariul, nume);
    }
}
