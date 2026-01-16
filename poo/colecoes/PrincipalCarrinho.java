public class PrincipalCarrinho {
    public static void main(String[] args) {
        Carrinho c = new Carrinho();

        c.adicionar(new ProdutoDigital("Curso Java", 80));
        c.adicionar(new ProdutoFisico("Livro", 50, 10));

        System.out.println(c.calcularTotal());
    }
}
