public class CajaEmpresa {

    private int dineroCaja;

    public CajaEmpresa(){

    }

    public CajaEmpresa(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }

    public int getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }

    @Override
    public String toString() {
        return "Dinero actual de la caja: " + dineroCaja;
    }
}
