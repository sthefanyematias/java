public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void info() {
        System.out.println("Produto fisico: " + nome + " - R$" + preco);
    }
}
