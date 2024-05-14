package Classes;

public class Card implements IModPlata {
    @Override
    public void plateste(String numeClient, Double sumaDePlata) {
        System.out.println("Clientul " + numeClient + " a platit cu cardul suma de " + sumaDePlata + " RON.");
    }
}
