import javax.swing.*;

public class Ej_14_desplazarPosicion {
    public static void main(String[] args) {
        int a[] = new int[5];
        int aux[] = new int[5];
        System.out.println("Se ingresa valores al array");
        int i;
        int j=1;
        for (i=0;i<a.length;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar valor: "));
        }
        for(i=0;i<a.length;i++){
            System.out.println("los valores de a[] no desplazados son: "+a[i]);
        }
        for(i=0;i<a.length;i++){
            aux[i]=a[i];
        }
        for(i=0;i<a.length-1;i++){
            a[j]=aux[i];
            j++;
        }
        a[0]=aux[4];

        for(i=0;i<a.length;i++){
            System.out.println("los valores de a[] desplazados son: "+a[i]);
        }
    }
}
