package BazaDeDate.Classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instanta = null;

    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {  //neaparat de facut constructorul private pentru Singleton
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public static void setInstanta(ConexiuneBazaDeDate instanta) {
        ConexiuneBazaDeDate.instanta = instanta;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }

    // keyword synchronized blocheaza functia din a fi apelata de mai multe thread-uri (nu va mai putea fi apelata de pe alte fire de executie)
    public static synchronized  ConexiuneBazaDeDate getInstance(String numeBaza,
                                                                int nrTabele,
                                                                String linkConexiune) {
        if(instanta==null) {
            instanta = new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instanta;
    }
}
