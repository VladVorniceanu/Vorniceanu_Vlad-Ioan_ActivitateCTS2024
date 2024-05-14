package Main;

import Classes.IInternare;
import Classes.Internare;
import Classes.Persoana;
import Classes.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare(new Persoana("Vlad", true));
        Internare internare2 = new Internare(new Persoana("Andrei", false));

        IInternare proxyInternare1 = new ProxyInternare(internare1);
        IInternare proxyInternare2 = new ProxyInternare(internare2);
        IInternare proxy3 = new ProxyInternare(new Persoana("Misu", true));
        IInternare proxy4 = new ProxyInternare(new Persoana("Mihai", false));

        internare1.internare();
        internare2.internare();
        proxyInternare1.internare();
        proxyInternare2.internare();
        proxy3.internare();
        proxy4.internare();
    }
}