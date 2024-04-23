package Classes;

public class VerificatorPeluza implements IVerificator{
    @Override
    public void verificare(String nume) {
        System.out.println("Se verifica corporal " + nume);
    }
}
