
public class OmitirPalabras {
    public static void main(String[] args) {
        String texto = "Hola a todos en clase";

        for (String palabra : texto.split(" ")) {
            if (palabra.length() < 3) continue;
            System.out.println(palabra);
        }
    }
}
