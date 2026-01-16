public class PrincipalContaSimples {
    public static void main(String[] args) {
        ContaSimples conta = new ContaSimples();
        conta.titular = "Sthefany";
        conta.saldo = 100;

        conta.depositar(50);
        conta.sacar(30);

        System.out.println(conta.saldo);
    }
}
