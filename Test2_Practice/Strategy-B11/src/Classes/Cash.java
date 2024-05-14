package Classes;

public class Cash implements IModPlata {
    @Override
    public void plateste(String numeClient, Double sumaDePlata) {
        System.out.println("Clientul " + numeClient + " a platit CASH suma de " + sumaDePlata + " RON.");
    }
}
