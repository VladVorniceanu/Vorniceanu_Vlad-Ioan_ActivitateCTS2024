package Classes;

public class Pozitie {
    private int posX;
    private int posY;

    @Override
    public String toString() {
        return "Pozitie{" +
                "posX=" + posX +
                ", posY=" + posY +
                '}';
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Pozitie(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
}
