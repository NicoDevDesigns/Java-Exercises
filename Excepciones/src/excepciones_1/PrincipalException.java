package excepciones_1;

import javax.swing.*;

public class PrincipalException {
    public static void main(String[] args) {

        Calculadora calcu = new Calculadora();
        String valor= JOptionPane.showInputDialog("Ingrese un entero: ");
        String numerador=JOptionPane.showInputDialog("Ingrese el numerador: ");
        String denominador=JOptionPane.showInputDialog("Ingrese el denominador: ");
        int divisor;
        double division;

        try {
            divisor= Integer.parseInt(valor);
            division = calcu.dividir(10,divisor);
            System.out.println("El valor de la division es: "+division);
            double division2 = calcu.dividir(numerador,denominador);
            System.out.println("El valor de la division es: "+division2);
        }catch (NumberFormatException nfe){
            System.out.println("Hay una excepcion, ingrese un valor numerico!"+nfe.getMessage());
            main(args);
        }catch (FormatoNumeroException e){
            System.out.println("Se detecto una excepcion: Ingrese un numero valido!"+e.getMessage());
            e.printStackTrace(System.out);

        }catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion"+ae.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional se ejecuta con o sin excepcion");
        }

        System.out.println("Continuamos con el flujo de nuestra aplicacion");
    }
}
