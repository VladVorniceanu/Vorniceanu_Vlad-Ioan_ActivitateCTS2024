package Classes.FactoryMethod;

import Classes.Asistent;
import Classes.Personal;

public class AsistentFactory implements IFactory {

    @Override
    public Personal createPersonal(String nume, String mail) {
        return new Asistent(nume, mail);
    }
}
