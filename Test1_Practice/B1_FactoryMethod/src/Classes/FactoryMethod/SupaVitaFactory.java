package Classes.FactoryMethod;

import Classes.Supa;
import Classes.SupaVita;

public class SupaVitaFactory implements ISoupFactory{

    @Override
    public Supa cookSoup(int mainIngredientQuantity) {
        return new SupaVita(mainIngredientQuantity);
    }
}
