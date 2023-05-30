import javax.swing.*;

public class Practica1_parImpar {
    public static void main(String[] args) {

        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }
    }
}
