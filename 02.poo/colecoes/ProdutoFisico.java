public class ProdutoFisico implements Produto {
    String nome;
    double preco;
    double frete;

    ProdutoFisico(String nome, double preco, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.frete = frete;
    }

    public double getPreco() {
        return preco + frete;
    }
}
