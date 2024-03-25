package Classes.FactoryMethod;

import Classes.Supa;
import Classes.SupaCiuperci;

public class SupaCiupierciFactory implements ISoupFactory{
    @Override
    public Supa cookSoup(int mainIngredientQuantity) {
        return new SupaCiuperci(mainIngredientQuantity);
    }
}
