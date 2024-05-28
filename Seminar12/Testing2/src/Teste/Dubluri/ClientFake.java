package Teste.Dubluri;

import Classes.IPersoana;

public class ClientFake implements IPersoana {

    private String valoareGetSex;
    private int valoareGetVarsta;
    private boolean valoareCheckCnp;

    public ClientFake(String valoareGetSex, int valoareGetVarsta, boolean valoareCheckCnp) {
        this.valoareGetSex = valoareGetSex;
        this.valoareGetVarsta = valoareGetVarsta;
        this.valoareCheckCnp = valoareCheckCnp;
    }

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareCheckCnp(boolean valoareCheckCnp) {
        this.valoareCheckCnp = valoareCheckCnp;
    }

    @Override
    public String getSex() {
        return this.valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return this.valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return this.valoareCheckCnp;
    }
}
