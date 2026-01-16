public class Conta {
    String titular;
    double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean debitar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
