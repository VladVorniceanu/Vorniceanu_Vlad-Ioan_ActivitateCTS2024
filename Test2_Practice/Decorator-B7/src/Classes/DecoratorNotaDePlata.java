package Classes;

public abstract class DecoratorNotaDePlata implements INotaDePlata {
    protected INotaDePlata notaDePlataAbstracta;

    @Override
    public void printeazaNotaDePlata() {
        notaDePlataAbstracta.printeazaNotaDePlata();
        System.out.println("Va uram un an nou cu bine!");
    }

    public DecoratorNotaDePlata(INotaDePlata notaDePlataAbstracta) {
        this.notaDePlataAbstracta = notaDePlataAbstracta;
    }
}
