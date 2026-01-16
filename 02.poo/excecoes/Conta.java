public class Conta {
    double saldo;

    Conta(double saldo) {
        this.saldo = saldo;
    }

    void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException();
        }
        saldo -= valor;
    }
}
