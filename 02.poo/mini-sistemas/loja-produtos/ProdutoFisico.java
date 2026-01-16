public class ProdutoFisico implements Produto {
    private double preco;
    private double frete;

    public ProdutoFisico(double preco, double frete) {
        this.preco = preco;
        this.frete = frete;
    }

    public double calcularPrecoFinal() {
        return preco + frete;
    }
}
