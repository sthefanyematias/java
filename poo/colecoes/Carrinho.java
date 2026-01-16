import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionar(Produto p) {
        produtos.add(p);
    }

    double calcularTotal() {
        double soma = 0;
        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        return soma;
    }
}
