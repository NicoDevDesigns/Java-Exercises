import javax.swing.*;
import java.util.Scanner;

public class Ej_13_tresArreglosMezclados {
    public static void main(String[] args) {

        int a[] = new int[2];
        int b[] = new int[2];
        int c[] = new int[4];

        int i=0,j=0,k=0;
        int w;
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingreso de valores en arreglo a[]");
        for(i=0;i<a.length;i++){
            System.out.println("Ingresar valor en posicion ["+(i+1)+"]: ");
            a[i]=ingresar.nextInt();
        }
        System.out.println("Ingreso de valores en arreglo b[]");
        for(i=0;i<b.length;i++){
            b[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar valor en posicion ["+(i+1)+"]: "));
        }
        i=0;
        System.out.println("Ingresar los valores al tercer arreglo");
            c[i]=a[j];
            i++;
            j++;
            c[i]=a[j];
            i++;
            c[i]=b[k];
            i++;
            k++;
            c[i]=b[k];
            for(i=0;i<c.length;i++){
                System.out.println("El arreglo c es:");
                System.out.println("c["+(i+1)+"]: "+c[i]);
            }

    }
}
