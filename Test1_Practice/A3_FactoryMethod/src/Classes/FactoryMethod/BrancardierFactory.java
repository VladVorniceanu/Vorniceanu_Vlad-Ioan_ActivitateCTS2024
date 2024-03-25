package Classes.FactoryMethod;

import Classes.Brancardier;
import Classes.Personal;

public class BrancardierFactory implements IFactory{

    @Override
    public Personal createPersonal(String nume, String mail) {
        return new Brancardier(nume, mail);
    }
}
