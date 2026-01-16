public class PrincipalProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Caderno", 25);

        p.setPreco(30);

        System.out.println(p.getNome());
        System.out.println(p.getPreco());
    }
}
