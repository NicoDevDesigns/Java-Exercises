import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String numeroStr= scanner.nextLine();

        int numeroDecimal=0;
        try{
            numeroDecimal=scanner.nextInt();//Integer.parseInt((numeroStr));
        }catch (InputMismatchException e){
            System.out.println("Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("Numero decimal: "+ numeroDecimal);

        System.out.println("Numero binario de "+numeroDecimal+" = "+ Integer.toBinaryString(numeroDecimal));

        String mensaje= "Numero binario de "+numeroDecimal+" = "+ Integer.toBinaryString(numeroDecimal);


        String resultadoOctal="Numero octal de "+ numeroDecimal+ " = " +Integer.toOctalString(numeroDecimal);

        System.out.println(resultadoOctal);
    }
}
