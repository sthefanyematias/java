public class AsciiParaNome {
    public static void main(String[] args) {
        int[] ascii = {83, 116, 104, 101, 102, 97, 110, 121};

        for (int i = 0; i < ascii.length; i++) {
            System.out.print((char) ascii[i]);
        }
    }
}
