package Classes.Factory;

import Classes.Medic;
import Classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariul) {
        return new Medic(salariul, nume);
    }
}
