
import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        } while (n <= 0);
    }
}
