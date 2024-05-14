package Classes;

public class LaCapatDeLinie implements State{

    @Override
    public void setState(Autobuz autobuz) {
        autobuz.setState(this);
    }
}
