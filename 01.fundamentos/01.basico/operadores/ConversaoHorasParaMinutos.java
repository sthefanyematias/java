import java.util.Scanner;

public class ConversaoHorasParaMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();
        int minutos = horas * 60;
        System.out.println("Minutos: " + minutos);
        scanner.close();
    }
}
