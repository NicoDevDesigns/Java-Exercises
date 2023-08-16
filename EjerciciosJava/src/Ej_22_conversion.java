import java.util.Scanner;

public class Ej_22_conversion {
    public static void main(String[] args) {

        int numero = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un valor: ");
        int valor1 = sc.nextInt();

        String valorString = String.valueOf(valor1);

        System.out.println(valorString);

        String cadena = String.valueOf(numero);

        System.out.println(cadena);

        double pi = Double.parseDouble("3.14");

        System.out.println(pi);

    }
}
