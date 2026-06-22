
import java.util.Scanner;

public class MostrarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if ("aeiou".indexOf(c) != -1) {
                System.out.println(c);
            }
        }
    }
}
