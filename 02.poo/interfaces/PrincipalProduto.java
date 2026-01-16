public class PrincipalProduto {
    public static void main(String[] args) {
        Produto p1 = new ProdutoFisico(100, 20);
        Produto p2 = new ProdutoDigital(80);

        System.out.println(p1.calcularPrecoFinal());
        System.out.println(p2.calcularPrecoFinal());
    }
}
