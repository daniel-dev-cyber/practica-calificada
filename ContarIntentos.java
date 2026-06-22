
import java.util.Scanner;

public class ContarIntentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, intentos = 0;

        do {
            System.out.print("Ingrese número positivo: ");
            num = sc.nextInt();
            intentos++;
        } while (num <= 0);

        System.out.println("Intentos: " + intentos);
    }
}
