public class PrincipalConta {
    public static void main(String[] args) {
        Conta c = new Conta(100);

        try {
            c.sacar(150);
            System.out.println(c.saldo);
        } catch (IllegalArgumentException e) {
            System.out.println("Saldo insuficiente");
        }
    }
}
