public class Compra {

    void finalizar(Pagamento pagamento, double valor) {
        if (pagamento.pagar(valor)) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra negada");
        }
    }
}
