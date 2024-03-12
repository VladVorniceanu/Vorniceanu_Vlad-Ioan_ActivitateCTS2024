package Classes.Factory;

import Classes.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariul);
}
