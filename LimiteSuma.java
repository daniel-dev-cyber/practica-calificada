
public class LimiteSuma {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;

            if (suma > 50) break;
        }

        System.out.println("Resultado: " + suma);
    }
}
