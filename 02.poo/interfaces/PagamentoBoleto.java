public class PagamentoBoleto implements Pagamento {

    public boolean pagar(double valor) {
        return valor <= 500;
    }
}
