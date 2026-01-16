public class PagamentoCartao implements Pagamento {
    double limite;

    PagamentoCartao(double limite) {
        this.limite = limite;
    }

    public boolean pagar(double valor) {
        if (valor <= limite) {
            limite -= valor;
            return true;
        }
        return false;
    }
}
