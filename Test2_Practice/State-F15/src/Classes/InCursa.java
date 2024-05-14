package Classes;

public class InCursa implements State{
    @Override
    public void setState(Autobuz autobuz) {
        autobuz.setState(this);
    }
}
