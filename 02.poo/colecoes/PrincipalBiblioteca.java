import java.util.Scanner;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        b.adicionar(new Livro("Java Básico", "Ana"));
        b.adicionar(new Livro("POO em Java", "Carlos"));

        b.listar();

        String titulo = sc.nextLine();
        Livro encontrado = b.buscar(titulo);

        if (encontrado != null) {
            System.out.println(encontrado.titulo);
        } else {
            System.out.println("Livro não encontrado");
        }
    }
}
