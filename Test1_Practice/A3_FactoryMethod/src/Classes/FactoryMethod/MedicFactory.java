package Classes.FactoryMethod;

import Classes.Medic;
import Classes.Personal;

public class MedicFactory implements IFactory{

    @Override
    public Personal createPersonal(String nume, String mail) {
        return new Medic(nume, mail);
    }
}
