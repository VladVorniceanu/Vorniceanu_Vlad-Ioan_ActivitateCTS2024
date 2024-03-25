import Classes.Pacient;
import Classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder("Pepsi")
                .setHasBathRobe(true)
                .setHasBreakfast(true)
                .setHasSlippers(true)
                .build();

        Pacient altPacient = new PacientBuilder("Coca-Cola")
                .setHasBathRobe(true)
                .build();

        System.out.println(pacient1);
        System.out.println(altPacient);
    }
}
