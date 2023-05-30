import java.util.Scanner;

public class Ej_10_IngresaArrayInverso {
    public static void main(String[] args) {
        int array[]= new int [3];
        Scanner ingresar = new Scanner(System.in);
        for (int i = 0;i< array.length;i++){
            System.out.println("Ingrese un valor: ");
            array[i]=ingresar.nextInt();
        }
        System.out.println("Se recorre el array en forma inversa");
        int j= array.length-1;
        while(j>=0){
            System.out.println("|"+array[j]+"|\n");
            j--;
        }
    }
}
