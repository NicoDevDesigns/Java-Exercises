import java.util.Scanner;

public class Ej_12_tresArreglos {
    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[6];
        int i,j;

        Scanner ingresar = new Scanner(System.in);
        System.out.println("Introducir datos en el array [a]");
        for (i=0;i<a.length;i++){
            System.out.println("Posicion "+(i+1)+" :");
            a[i]=ingresar.nextInt();
        }
        System.out.println("Introducir datos en el array [b]");
        for (i=0;i<b.length;i++){
            System.out.println("Posicion "+(i+1)+" :");
            b[i]=ingresar.nextInt();
        }
        System.out.println("**Se ingresa los valores de a y b en el array c**");
        i=0;
        for (j=0;j<a.length;j++){
            c[i]=a[j];
            i++;
            c[i]=b[j];
            i++;
            }
        System.out.println("**** Imprimir el arreglo c ****");
        for (j=0;j<c.length;j++){
            System.out.println("Arreglo [c] posision: "+(j+1)+" valor: "+c[j]);
        }
    }
}
