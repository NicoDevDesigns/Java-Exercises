package excepciones_4;

import java.util.Scanner;

public class PrincipalException {

    public static void main(String[] args) {
        Scanner IngresarValor = new Scanner(System.in);
        int valor;
        System.out.println("Dame un valor numerico: ");
        try {
            valor = IngresarValor.nextInt();
            System.out.println("El valor es: "+valor);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("El valor ingresado es incorrecto!");
        }finally {
            System.out.println("El programa a finalizado!");
        }

    }
}
