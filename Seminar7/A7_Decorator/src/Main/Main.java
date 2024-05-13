package Main;

import Clase.*;

public class Main {
    public static void main(String[] args) {
        IDiagnosticAbstract diagnostic = new DiagnosticConcret("Covid", "lipsa miros", true);
        diagnostic.printeazaDiagnostic();

        DecoratorAbstract decorator = new AplicatieMobila(diagnostic);
        decorator.printeazaDiagnostic();
        decorator.afisareOnline();

        DecoratorAbstract decorator2 = new Website(diagnostic);
        decorator2.afisareOnline();
    }
}