package Classes;

public class VerificatorTribuna implements IVerificator {

    @Override
    public void verificare(String nume) {
        System.out.println("Este verificat bagajul lui " + nume);
    }
}
