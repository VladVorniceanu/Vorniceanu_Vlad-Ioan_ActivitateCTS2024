package Classes.FactoryMethod;

import Classes.Supa;

public abstract interface ISoupFactory {
    public abstract Supa cookSoup(int mainIngredientQuantity);
}
