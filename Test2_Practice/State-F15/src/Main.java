import Classes.Autobuz;
import Classes.LaCapatDeLinie;
import Classes.LaReparat;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(new LaCapatDeLinie(), 123);
        autobuz.terminaCursa();
        autobuz.pleacaInCursa();
        autobuz.terminaCursa();
        autobuz.repara();
        autobuz.repara();
        autobuz.pleacaInCursa();
        autobuz.finalizeazaReparatie();
    }
}