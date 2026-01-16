public class ProdutoDigital implements Produto {
    String nome;
    double preco;

    ProdutoDigital(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
