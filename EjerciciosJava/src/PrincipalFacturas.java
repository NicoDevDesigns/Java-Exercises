package gestionFacturas;

import java.util.Scanner;

public class PrincipalFacturas {
    public static void main(String[] args) {
        String codigo=" ";
        int kilos=0;
        float precio=0;
        float importeFactura=0;
        float facturacionTotal=0;
        int contador=0;
        int totalKilos=0;

        Scanner sc = new Scanner(System.in);

        for(int i=1;i<3;i++){
            System.out.println("Factura nº "+ i);
            System.out.print("Codigo de producto: ");
            codigo=sc.next();
            System.out.print("Cantidad de kilos: ");
            kilos=sc.nextInt();
            System.out.print("Precio: ");
            precio=sc.nextFloat();
            importeFactura=kilos*precio;
            facturacionTotal=facturacionTotal+importeFactura;

            if(importeFactura>=1000){
                contador++;
            }
            totalKilos=totalKilos+kilos;
        }
        System.out.println("************Detalle de la ventas**********");
        System.out.println("facturacion total: $"+facturacionTotal);
        System.out.println("Total de kilos vendidos: "+totalKilos);
    }
}
