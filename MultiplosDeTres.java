
import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int contador = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) contador++;
        }
        System.out.println("Cantidad: " + contador);
    }
}
