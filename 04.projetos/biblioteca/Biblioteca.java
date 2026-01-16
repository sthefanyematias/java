import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionar(Livro l) {
        livros.add(l);
    }

    public void listar() {
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            System.out.println(i + " - " + l.titulo + " - " + l.autor + " - " + (l.alugado ? "Alugado" : "Disponivel"));
        }
    }

    public void alugar(int indice) {
        if (indice >= 0 && indice < livros.size()) {
            Livro l = livros.get(indice);
            if (!l.alugado) {
                l.alugado = true;
                System.out.println("Livro alugado com sucesso");
            } else {
                System.out.println("Livro ja esta alugado");
            }
        } else {
            System.out.println("Indice invalido");
        }
    }

    public void devolver(int indice) {
        if (indice >= 0 && indice < livros.size()) {
            Livro l = livros.get(indice);
            if (l.alugado) {
                l.alugado = false;
                System.out.println("Livro devolvido com sucesso");
            } else {
                System.out.println("Livro nao estava alugado");
            }
        } else {
            System.out.println("Indice invalido");
        }
    }
}
