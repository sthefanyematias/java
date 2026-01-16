public class Boleto extends Pagamento {

    Boleto(double valor) {
        super(valor);
    }

    boolean pagar() {
        return valor <= 500;
    }
}
