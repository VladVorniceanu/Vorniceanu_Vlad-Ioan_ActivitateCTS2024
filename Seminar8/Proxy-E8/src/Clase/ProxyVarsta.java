package Clase;

public class ProxyVarsta implements IVanzare{
    private IVanzare vanzareBilet;
    private static int varstaMinima = 14;

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    public ProxyVarsta(IVanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getVarsta()>=14) {
            vanzareBilet.vanzare(persoana);
        } else {
            System.out.println("Spectatorul " + persoana.getNume()
                    + " nu indeplineste conditiile de varsta, avand pentru a putea achizitiona un bilet la meci.");
        }
    }
}
