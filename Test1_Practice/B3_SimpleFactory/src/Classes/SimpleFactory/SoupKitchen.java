package Classes.SimpleFactory;

import Classes.BeefSoup;
import Classes.MushroomsSoup;
import Classes.Soup;
import Classes.VegetablesSoup;

public class SoupKitchen {
    public Soup cookSoup(SoupTypes soupType, int mainIngredientQuantity, int soupQuantity) throws Exception {
        switch (soupType) {
            case Beef:
                return new BeefSoup(mainIngredientQuantity,soupQuantity);
            case Mushrooms:
                return new MushroomsSoup(mainIngredientQuantity,soupQuantity);
            case Vegetables:
                return new VegetablesSoup(mainIngredientQuantity,soupQuantity);
            default:
                throw new Exception("The desired soup is not available in the menu");
        }
    }
}
