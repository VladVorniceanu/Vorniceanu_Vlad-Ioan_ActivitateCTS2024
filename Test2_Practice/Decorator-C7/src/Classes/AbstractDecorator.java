package Classes;

public abstract class AbstractDecorator implements IFarmacie{
    IFarmacie farmacie;

    public AbstractDecorator(IFarmacie farmacie) {
        this.farmacie = farmacie;
    }

    @Override
    public void printeazaBonFiscal() {
        farmacie.printeazaBonFiscal();
        System.out.println("Va dorim un an nou cu bine si plin de bucurii!");
    }

    @Override
    public void servesteClientul() {
        System.out.println("Pofiti produsele dorite.");
        printeazaBonFiscal();
    }
}
