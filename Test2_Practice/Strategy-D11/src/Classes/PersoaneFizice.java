package Classes;

public class PersoaneFizice implements IProcesareDocumente{

    @Override
    public void proceseazaDocumente(String numeClient) {
        System.out.println("Pentru clientul " + numeClient + " s-au procesat buletinul si adeverinta de munca, fiind persoana fizica.");
    }
}
