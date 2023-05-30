import java.util.Scanner;

public class Ej_17_calcularTotalDescuento {
    public static void main(String[] args) {
        int cantPiezasCompradas = 0;
        double precioPieza = 0;
        double precioTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar la cantidad comprada: ");
        cantPiezasCompradas = sc.nextInt();
        System.out.print("Ingresar el precio de la pieza: ");
        precioPieza = sc.nextDouble();
        precioTotal = calculoPrecio(cantPiezasCompradas,precioPieza);
        System.out.println("El precio total de piezas compradas es: $"+ precioTotal);
    }
    public static double calculoPrecio(int piezas,double precio){
        double total;
        if(piezas>=100){
            int descuento = 50;
            total = (precio*piezas)-(precio*piezas*descuento/100);

        }else {
            total = precio*piezas;
        }
        return total;
    }

}
