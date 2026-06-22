
public class QuitarEspacios {
    public static void main(String[] args) {
        String texto = "Hola mundo";

        for (char c : texto.toCharArray()) {
            if (c == ' ') continue;
            System.out.print(c);
        }
    }
}
