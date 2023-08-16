import java.util.Scanner;

public class Ej_23_leerDatosUsuarioScanner {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre;
        System.out.print("Ingresar tu nombre: ");
        nombre = lector.nextLine();
        System.out.println("Tu nombre es: "+nombre);
    }
}
