package Classes.FactoryMethod;

import Classes.Personal;

public interface IFactory {
    public abstract Personal createPersonal(String nume, String mail);
}
