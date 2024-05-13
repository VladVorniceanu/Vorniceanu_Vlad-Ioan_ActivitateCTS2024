package Classes;

public class ItemsMeniu extends SectiuneMeniu{

    public ItemsMeniu(String numeSectiune) {
        super(numeSectiune);
    }

    @Override
    public void addSectiune(SectiuneMeniu sectiuneNoua) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SectiuneMeniu getSectiune(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delecteSectiune(SectiuneMeniu sectiuneDeSters) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaSectiune(String nivelIndentare) {
        System.out.println(nivelIndentare+super.numeSectiune);
    }
}
