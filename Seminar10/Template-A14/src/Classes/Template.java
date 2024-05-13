package Classes;

public abstract class Template {
    public final void internare(Pacient pacient) {
        analizeazaSanatate(pacient);
        if(disponibilitatePaturi()>0) {
            emitereFisa(pacient);
        } else {
            refuzaInternare(pacient);
        }
    }

    protected abstract void analizeazaSanatate(Pacient pacient);
    protected abstract int disponibilitatePaturi();
    protected abstract void emitereFisa(Pacient pacient);
    protected abstract void refuzaInternare(Pacient pacient);
}
