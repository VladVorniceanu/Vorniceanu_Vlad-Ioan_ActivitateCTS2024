package Classes;

public class LaReparat implements State{
    @Override
    public void setState(Autobuz autobuz) {
        autobuz.setState(this);
    }
}
