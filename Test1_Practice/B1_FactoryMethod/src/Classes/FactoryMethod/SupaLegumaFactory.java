package Classes.FactoryMethod;

import Classes.Supa;
import Classes.SupaLeguma;

public class SupaLegumaFactory implements ISoupFactory{

    @Override
    public Supa cookSoup(int mainIngredientQuantity) {
        return new SupaLeguma(mainIngredientQuantity);
    }
}
