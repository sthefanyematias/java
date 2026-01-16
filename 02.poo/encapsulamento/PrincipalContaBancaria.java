public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Sthefany", 200);

        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    }
}
