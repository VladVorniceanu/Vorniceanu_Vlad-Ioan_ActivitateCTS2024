package Classes;

public class VegetablesSoup extends Soup{
    int vegetablesQuantity;

    public VegetablesSoup(int vegetablesQuantity, int quantity) {
        this.vegetablesQuantity = vegetablesQuantity;
        super.quantity = quantity;
        super.isVegan = true;
    }

    @Override
    public String toString() {
        return "This vegetables soup has "
                + super.quantity
                + " ML, "
                + this.vegetablesQuantity
                + " grams of vegetables in it and it is"
                + (super.isVegan ? "" : " not")
                + " vegan.";
    }
}
