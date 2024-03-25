package Classes;

public class SupaCiuperci extends Supa{

    public int cantitateCiuperci;

    public SupaCiuperci(int cantitateCiuperci) {
        this.cantitateCiuperci = cantitateCiuperci;
        super.cantitateMl = 500;
        super.isVegan = true;
    }

    @Override
    public String toString() {
        return "Supa de ciuperci are un gramaj de "
                + super.cantitateMl
                + ", contine "
                + this.cantitateCiuperci
                + " grame de legume si"
                + (super.isVegan ? "" : " nu")
                + " este vegana.";
    }
}
