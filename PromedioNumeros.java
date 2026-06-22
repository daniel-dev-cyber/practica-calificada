
import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double suma = 0;

        for (int i = 0; i < N; i++) {
            suma += sc.nextDouble();
        }
        System.out.println("Promedio: " + (suma / N));
    }
}
