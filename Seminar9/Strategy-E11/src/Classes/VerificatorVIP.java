package Classes;

public class VerificatorVIP implements IVerificator {
    @Override
    public void verificare(String nume) {
        System.out.println("Este verificat biletul lui " + nume);
    }
}
