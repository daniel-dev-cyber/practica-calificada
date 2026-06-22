
import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cont = 0;
        String entrada;

        do {
            System.out.print("Ingrese nota (salir para terminar): ");
            entrada = sc.nextLine();

            if (!entrada.equals("salir")) {
                suma += Double.parseDouble(entrada);
                cont++;
            }

        } while (!entrada.equals("salir"));

        System.out.println("Promedio: " + (suma / cont));
    }
}
