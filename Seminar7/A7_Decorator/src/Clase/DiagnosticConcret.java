package Clase;

public class DiagnosticConcret implements IDiagnosticAbstract {
    private String numeDiagnostic;
    private String simptome;
    private boolean necesitaSpitalizare;

    public DiagnosticConcret(String numeDiagnostic, String simptome, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    public void setNumeDiagnostic(String numeDiagnostic) {
        this.numeDiagnostic = numeDiagnostic;
    }

    public String getSimptome() {
        return simptome;
    }

    public void setSimptome(String simptome) {
        this.simptome = simptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }

    public void setNecesitaSpitalizare(boolean necesitaSpitalizare) {
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Numele diagnosticului: " + this.numeDiagnostic
                            + "\nSimptome: " + this.simptome
                            + " si" + ((necesitaSpitalizare)? "" : " nu")
                            + " necesita spitalizare.\n");
    }
}
