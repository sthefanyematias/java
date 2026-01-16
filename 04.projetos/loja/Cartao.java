public class Cartao implements Pagamento {
    double saldo;

    public Cartao(double saldo) {
        this.saldo = saldo;
    }

    public boolean pagar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
