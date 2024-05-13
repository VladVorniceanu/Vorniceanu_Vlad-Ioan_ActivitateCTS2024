package Classes;

public abstract class SectiuneMeniu {
    String numeSectiune;

    public SectiuneMeniu(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    public abstract void addSectiune(SectiuneMeniu sectiuneNoua);
    public abstract SectiuneMeniu getSectiune(int index);
    public abstract void delecteSectiune(SectiuneMeniu sectiuneDeSters);
    public abstract void afiseazaSectiune(String nivelIndentare);

    public String getNumeSectiune() {
        return numeSectiune;
    }

    public void setNumeSectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }
}
