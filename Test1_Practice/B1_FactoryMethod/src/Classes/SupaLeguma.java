package Classes;

public class SupaLeguma extends Supa {
    int cantitateLegume;

    public SupaLeguma(int cantitateLegume) {
        this.cantitateLegume = cantitateLegume;
        super.cantitateMl = 350;
        super.isVegan = true;
    }

    @Override
    public String toString() {
        return "Supa de legume are un gramaj de "
                + super.cantitateMl
                + ", contine "
                + this.cantitateLegume
                + " grame de legume si"
                + (super.isVegan ? "" : " nu")
                + " este vegana.";
    }
}
