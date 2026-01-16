public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void mostrarProduto() {
        System.out.println(nome);
        System.out.println(preco);
    }
}
