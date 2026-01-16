public class PrincipalPagamento {
    public static void main(String[] args) {
        Pagamento p1 = new Cartao(200, 300);
        Pagamento p2 = new Pix(150);
        Pagamento p3 = new Boleto(600);

        System.out.println(p1.pagar());
        System.out.println(p2.pagar());
        System.out.println(p3.pagar());
    }
}
