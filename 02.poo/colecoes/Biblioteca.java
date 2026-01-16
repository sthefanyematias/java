import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    void adicionar(Livro livro) {
        livros.add(livro);
    }

    void listar() {
        for (Livro l : livros) {
            System.out.println(l.titulo + " - " + l.autor);
        }
    }

    Livro buscar(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}
