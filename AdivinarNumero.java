
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int secreto = r.nextInt(10) + 1;
        int num;

        do {
            System.out.print("Adivina (1-10): ");
            num = sc.nextInt();
        } while (num != secreto);

        System.out.println("Correcto 🎉");
    }
}
