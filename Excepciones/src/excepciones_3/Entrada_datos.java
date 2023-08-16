package excepciones_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_datos {
    public static void main(String[] args) {
        System.out.println("Que deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);
        int decision = entrada.nextInt();

        if(decision==1){
            try{
                pedirDatos();
            }catch (InputMismatchException e){
                System.out.println("Ingresaste valor incorrecto!");
            }

        }else {
            System.out.println("Adios!");
            System.exit(0);
        }
        entrada.close();
    }
    static void pedirDatos() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce la edad:");
        int edad = entrada.nextInt();
        System.out.println("Hola "+nombre_usuario+" tienes "+edad);

        entrada.close();
        System.out.println("Hemos terminado!");
    }
}
