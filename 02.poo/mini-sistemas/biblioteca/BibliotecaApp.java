import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Java Básico"));
        livros.add(new Livro("POO em Java"));

        System.out.print("Escolha o livro (0 ou 1): ");
        int opcao = sc.nextInt();

        Livro livro = livros.get(opcao);

        if (!livro.alugado) {
            livro.alugado = true;
            System.out.println("Livro alugado");
        } else {
            System.out.println("Livro indisponível");
        }
    }
}
