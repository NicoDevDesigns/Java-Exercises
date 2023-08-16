package excepciones_1;

import javax.swing.*;

public class UsoTryCatch {
    public static void main(String[] args) {

        String valor= JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;

        try {
            divisor= Integer.parseInt(valor);
            int division = 10/divisor;
            System.out.println(division);
        }catch (NumberFormatException nfe){
            System.out.println("Hay una excepcion, ingrese un valor numerico!"+nfe.getMessage());
            main(args);
        }catch (ArithmeticException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion"+ae.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional se ejecuta con o sin excepcion");
        }

        System.out.println("Continuamos con el flujo de nuestra aplicacion");
    }
}
