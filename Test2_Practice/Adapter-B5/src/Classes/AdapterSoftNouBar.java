package Classes;

public class AdapterSoftNouBar implements ISoftNouBar {

    FacturaBucatarie facturaBucatarie;

    public AdapterSoftNouBar(FacturaBucatarie facturaBucatarie) {
        this.facturaBucatarie = facturaBucatarie;
    }

    @Override
    public void printeazaFactura() {
        this.facturaBucatarie.printeazaFacturaBucatarie();
    }
}
