
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Saludar");
            System.out.println("2. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Hola 👋");
            }

        } while (opcion != 2);

        System.out.println("Programa terminado");
    }
}
