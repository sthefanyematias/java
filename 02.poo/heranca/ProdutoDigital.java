public class ProdutoDigital extends Produto {
    String formato;

    ProdutoDigital(String nome, double preco, String formato) {
        super(nome, preco);
        this.formato = formato;
    }

    void mostrarFormato() {
        System.out.println(formato);
    }
}
