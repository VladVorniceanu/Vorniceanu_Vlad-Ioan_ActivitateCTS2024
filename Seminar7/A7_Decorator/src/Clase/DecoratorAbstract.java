package Clase;

public abstract class DecoratorAbstract implements IDiagnosticAbstract{
    protected IDiagnosticAbstract diagnosticAbstract;
    public abstract void afisareOnline();

    public DecoratorAbstract(IDiagnosticAbstract diagnosticAbstract) {
        this.diagnosticAbstract = diagnosticAbstract;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnosticAbstract.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma.");
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnosticAbstract.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnosticAbstract.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnosticAbstract.isNecesitaSpitalizare();
    }
}
