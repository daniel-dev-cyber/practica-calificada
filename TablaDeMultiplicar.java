
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
