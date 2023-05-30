import javax.swing.*;
//import java.util.Scanner;

public class Ej_11_ImprimirArreglo {
    public static void main(String[] args) {
        int j;
        int[] array = new int[5];
        //Scanner ingresar = new Scanner(System.in);
        for (j = 0; j < array.length; j++){
           /* System.out.println("Introduce un numero: "+(j+1));
             array[j]=ingresar.nextInt();
            */
            array[j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "+(j+1)));
        }
        System.out.println("***********Imprimir los numeros**********");
        for(j = 0; j<5;j++){
            System.out.println(array[j]);
            System.out.println(array[4-j]);
        }
    }
}
