
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo && num > 1)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}
