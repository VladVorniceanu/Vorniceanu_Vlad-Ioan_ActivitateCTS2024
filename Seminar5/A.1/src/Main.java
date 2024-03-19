import Builder.classes.Pacient;
import Builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder()
                .setPatRabatabil(true)
                .setPapuciDeCamera(true)
                .setMicDejunInclus(true)
                .setHalat(true)
                .build();

        Pacient pacient2 = new PacientBuilder()
                .setPatRabatabil(true)
                .build();

        System.out.println(pacient);
        System.out.println(pacient2);

        Builder_v2.Pacient.PacientBuilder pacBuilder = new Builder_v2.Pacient.PacientBuilder();
        Builder_v2.Pacient newPacient = pacBuilder
                .setHalat(true)
                .setMicDejunInclus(true)
                .setPapuciDeCamera(true)
                .setPatRabatabil(true)
                .build();

    }
}