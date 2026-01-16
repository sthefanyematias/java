public class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void info() {
        System.out.println("Produto digital: " + nome + " - R$" + preco);
    }
}
