public class Cartao extends Pagamento {
    double limite;

    Cartao(double valor, double limite) {
        super(valor);
        this.limite = limite;
    }

    boolean pagar() {
        if (valor <= limite) {
            limite -= valor;
            return true;
        }
        return false;
    }
}
