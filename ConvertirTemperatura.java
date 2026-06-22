
import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        do {
            System.out.print("Celsius (fin para salir): ");
            entrada = sc.nextLine();

            if (!entrada.equals("fin")) {
                double c = Double.parseDouble(entrada);
                double f = (c * 9 / 5) + 32;
                System.out.println("Fahrenheit: " + f);
            }

        } while (!entrada.equals("fin"));
    }
}
