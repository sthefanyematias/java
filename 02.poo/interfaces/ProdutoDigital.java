public class ProdutoDigital implements Produto {
    double preco;

    ProdutoDigital(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        return preco;
    }
}
