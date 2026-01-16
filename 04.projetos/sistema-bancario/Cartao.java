public class Cartao {
    Conta conta;

    public Cartao(Conta conta) {
        this.conta = conta;
    }

    public boolean pagar(double valor) {
        return conta.debitar(valor);
    }
}
