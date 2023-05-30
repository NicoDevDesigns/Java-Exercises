import javax.swing.*;

public class Ej_16_ingresarNuneroArreglo {
    public static void main(String[] args) {

        int array[] = new int[5];
        int i;
        int contador=0;
        int aux;
        int aux2;
        System.out.println("*****Se ingresa valores al arreglo*****");
        for(i=0;i<array.length-3;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor: "));
            contador++;
        }
        aux = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un valor entero: "));
        for(i=0;i<array.length;i++){
            if(aux>array[i]){
                aux2=array[i];
            }
        }

        for(i=0;i<array.length;i++){
            System.out.println("Valor en el array["+(i+1)+"]: "+ array[i]);
        }
    }
}
