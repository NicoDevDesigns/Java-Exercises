import java.util.Scanner;

public class Ej_1_arrayVentas {
    public static void main(String[] args) {
        double ventas[]=new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 30 ventas del mes!");
        for (int i=0;i<ventas.length;i++){
            System.out.print("Ventas "+(i+1)+": ");
            ventas[i]=sc.nextDouble();
        }
        int k=0;
        int total=0;
        System.out.println("Ventas mayores a 1000: ");
        while(k<5){
            if (ventas[k]>=1000){
                System.out.println("$"+ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("EL total de las ventas mayores a 1000 son: "+total);

    }
}
