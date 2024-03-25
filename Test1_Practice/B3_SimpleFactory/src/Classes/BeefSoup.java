package Classes;

public class BeefSoup extends Soup{
    int beefQuantity;

    public BeefSoup(int beefQuantity, int soupQuantity) {
        this.beefQuantity = beefQuantity;
        super.quantity = soupQuantity;
        super.isVegan = false;
    }

    @Override
    public String toString() {
        return "This beef soup has "
                + super.quantity
                + " ML, "
                + this.beefQuantity
                + " grams of beef meat in it and it is"
                + (super.isVegan ? "" : " not")
                + " vegan.";
    }
}
