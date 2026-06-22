
import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int invertido = 0;

        for (; num != 0; num /= 10) {
            invertido = invertido * 10 + num % 10;
        }
        System.out.println("Invertido: " + invertido);
    }
}
