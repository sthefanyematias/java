public class Compra {
    void finalizar(Pagamento pagamento) {
        if (pagamento.pagar()) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra negada");
        }
    }
}
