
import java.util.Scanner;

public class SalirPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;

        while (true) {
            System.out.print("Escribe algo (salir para terminar): ");
            texto = sc.nextLine();

            if (texto.equals("salir")) break;
        }
    }
}
