package Classes;

public class SupaVita extends Supa{

    int cantitateCarneVita;

    public SupaVita(int cantitateCarneVita) {
        this.cantitateCarneVita = cantitateCarneVita;
        super.cantitateMl = 400;
        super.isVegan = false;
    }

    @Override
    public String toString() {
        return "Supa de vita are un gramaj de "
                + super.cantitateMl
                + ", contine "
                + this.cantitateCarneVita
                + " grame de carne de vita si"
                + (super.isVegan ? "" : " nu")
                + " este vegana.";
    }
}
