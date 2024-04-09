package Clase;

public class AplicatieMobila extends DecoratorAbstract {


    public AplicatieMobila(IDiagnosticAbstract diagnosticAbstract) {
        super(diagnosticAbstract);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul aplicatiei mobile, ati primit diagnosticul: " + super.getNumeDiagnostic()
                            + ", aveti simptomele: " + super.getSimptome()
                            + " si" + ((super.isNecesitaSpitalizare())? "" : " nu") + " aveti nevoie de spitalizare.");
    }
}
