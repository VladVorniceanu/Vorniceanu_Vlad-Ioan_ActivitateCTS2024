package Classes;

public class PersoaneJuridice implements IProcesareDocumente{

    @Override
    public void proceseazaDocumente(String numeClient) {
        System.out.println("Pentru clientul " + numeClient + " s-au procesat actele de infiintare a firmei si dovada inreg. la Registrul Comertului, fiind persoana juridica.");
    }
}
