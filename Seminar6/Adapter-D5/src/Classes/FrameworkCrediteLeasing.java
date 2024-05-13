package Classes;

public class FrameworkCrediteLeasing implements ICrediteLeasing{
    Credit credit;

    public FrameworkCrediteLeasing(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void oferireCrediteLeasing() {
        System.out.println("Clientul " + credit.getNumeClient() + " are un leasing pe o perioada de " +
                credit.getPerioada() + " ani, în valoare de " + credit.getValoareTotala());

    }
}
