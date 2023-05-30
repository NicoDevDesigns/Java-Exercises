import java.util.Scanner;

public class Ej_2_doWhileVentas {
    public static void main(String[] args) {
        int num=0, suma= 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            suma=suma+num;
        }while (num!=0);
            System.out.println("La suma de todos los numeros es: "+ suma);


    }
}
