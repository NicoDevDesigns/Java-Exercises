import java.util.Scanner;

public class Ej_5_ventasDescuento {
    public static void main(String[] args) {
        int cantPiezas=0;
        double totalPago=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de piezas de pan a comprar: ");
        cantPiezas=scanner.nextInt();
        if(cantPiezas>=50 && cantPiezas<100){
            totalPago=cantPiezas*4.5;
        } else if (cantPiezas>=100) {
            totalPago=cantPiezas*4;
        }else {
            totalPago=cantPiezas*5;
        }
        System.out.println("La cantidad de piezas son: "+cantPiezas+" La cantidad a pagar es: "+totalPago);

    }
}
