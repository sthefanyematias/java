public class ProdutoDigital implements Produto {
    private double preco;

    public ProdutoDigital(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        return preco;
    }
}
