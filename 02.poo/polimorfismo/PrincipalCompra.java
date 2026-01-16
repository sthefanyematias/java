public class PrincipalCompra {
    public static void main(String[] args) {
        Compra c = new Compra();

        Pagamento cartao = new Cartao(100, 80);
        Pagamento pix = new Pix(100);

        c.finalizar(cartao);
        c.finalizar(pix);
    }
}
