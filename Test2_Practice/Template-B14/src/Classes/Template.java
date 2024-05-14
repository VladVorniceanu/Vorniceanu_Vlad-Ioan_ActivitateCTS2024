package Classes;

public abstract class Template {
    public final void ocupaMasa(Client client) {
        if(curataMasa()) {
            if(asazaServetele()) {
                if(asazaTacamuri()) {
                    invitaPersoaneLaMasa(client);
                }
            }
        }
    }

    public abstract boolean curataMasa();
    public abstract boolean asazaServetele();
    public abstract boolean asazaTacamuri();
    public abstract void invitaPersoaneLaMasa(Client client);
}
