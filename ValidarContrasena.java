
import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd;

        do {
            System.out.print("Ingrese la contraseña: ");
            pwd = sc.nextLine();
        } while (!pwd.equals("1234"));

        System.out.println("✅ Acceso concedido");
    }
}

