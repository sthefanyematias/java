import java.io.File;

public class NavegadorArquivos {
    public static void main(String[] args) {
        File pasta = new File("C:\\");

        File[] arquivos = pasta.listFiles();

        if (arquivos != null) {
            for (File f : arquivos) {
                System.out.println(f.getName());
            }
        }
    }
}
