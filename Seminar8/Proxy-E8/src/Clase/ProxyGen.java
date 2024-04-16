package Clase;

public class ProxyGen implements IVanzare {
    IVanzare biletDeVandut;

    public ProxyGen(IVanzare biletDeVandut) {
        this.biletDeVandut = biletDeVandut;
    }



    @Override
    public void vanzare(Persoana persoana) {
        if(!persoana.isBarbat()) {
            biletDeVandut.vanzare(persoana);
        } else {
            System.out.println("Barbatii sunt rugati sa astepte vanzarea biletelor "
                    + " pentru toate doamnele disponibile, apoi sa viziteze casele de bilete pentru a achizitiona bilete in limita locurilor ramase libere.");
        }
    }
}
