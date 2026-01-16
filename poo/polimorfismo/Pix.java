public class Pix extends Pagamento {

    Pix(double valor) {
        super(valor);
    }

    boolean pagar() {
        return true;
    }
}
