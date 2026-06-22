
public class BuscarNumero {
    public static void main(String[] args) {
        int[] datos = {3, 7, 9, 12};

        for (int n : datos) {
            if (n == 9) {
                System.out.println("Encontrado");
                break;
            }
        }
    }
}
