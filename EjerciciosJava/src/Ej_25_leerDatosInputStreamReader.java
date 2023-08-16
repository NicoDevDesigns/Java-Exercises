import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej_25_leerDatosInputStreamReader {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nombre = "";

        try {
            System.out.println("Ingrese su nombre");
            nombre = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("EL nombre es: "+nombre);
    }
}
