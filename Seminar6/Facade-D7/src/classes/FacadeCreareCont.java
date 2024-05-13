package classes;

public class FacadeCreareCont {

    public void creareCont(Persoana persoana) {
        if (persoana.getVarsta() >= 18) {
            if (!persoana.isEsteUrmaritDePolitie()) {
                if (!persoana.isAreCreante()) {
                    System.out.println("Contul a fost creat cu succes!");
                } else {
                    System.out.println("Persoana are creante la alte banci, nu se poate realiza contul");
                }
            } else {
                System.out.println("Persoanaeste urmarita de politie, nu se poate realiza contul");
            }
        } else {
            System.out.println("Persoana nu are 18 ani, nu se poate realiza contul");
        }
    }
}
