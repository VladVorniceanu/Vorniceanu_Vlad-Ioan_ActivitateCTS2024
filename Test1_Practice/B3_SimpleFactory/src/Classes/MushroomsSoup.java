package Classes;

public class MushroomsSoup extends Soup{
    int mushroomsQuantity;

    public MushroomsSoup(int mushroomsQuantity, int soupQuantity) {
        this.mushroomsQuantity = mushroomsQuantity;
        super.quantity = soupQuantity;
        super.isVegan = true;
    }

    @Override
    public String toString() {
        return "This mushrooms soup has "
                + super.quantity
                + " ML, "
                + this.mushroomsQuantity
                + " grams of mushrooms in it and it is"
                + (super.isVegan ? "" : " not")
                + " vegan.";
    }
}
