public class Boleto implements Pagamento {
    public boolean pagar(double valor) {
        return valor <= 500;
    }
}
