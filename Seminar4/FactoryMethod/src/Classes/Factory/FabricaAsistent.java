package Classes.Factory;

import Classes.Asistent;
import Classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{

    @Override
    public PersonalSpital createPersonal(String nume, int salariul) {
        return new Asistent(salariul, nume);
    }
}
