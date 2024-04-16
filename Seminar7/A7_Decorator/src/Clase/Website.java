package Clase;

public class Website extends DecoratorAbstract {

    public Website(IDiagnosticAbstract diagnosticAbstract) {
        super(diagnosticAbstract);
    }

    @Override
    public void afisareOnline() {
        System.out.println("Pe website ati primit diagnosticul: " + super.getNumeDiagnostic()
                + ", aveti simptomele: " + super.getSimptome()
                + " si" + ((super.isNecesitaSpitalizare())? "" : " nu") + " aveti nevoie de spitalizare.");
    }
}
