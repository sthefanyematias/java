public class PrincipalCompra {
    public static void main(String[] args) {
        Compra c = new Compra();

        Pagamento cartao = new PagamentoCartao(200);
        Pagamento pix = new PagamentoPix();
        Pagamento boleto = new PagamentoBoleto();

        c.finalizar(cartao, 150);
        c.finalizar(pix, 300);
        c.finalizar(boleto, 600);
    }
}
