package Promedios;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        int num=0, cantidadNegativos=0, cantidadPositivos=0;
        int sumaNegativos=0,sumaPositivos=0,cantidadCeros=0;
        double promedioPositivo=0,promedioNegativo=0;
        int k=0;
        Scanner teclado = new Scanner(System.in);
        while(k<10){
            System.out.print("Introduce un numero: ");
            num=teclado.nextInt();
            if(num==0)cantidadCeros++;
            else if (num>0) {
                cantidadPositivos++;
                sumaPositivos=sumaPositivos+num;
            }else {
                cantidadNegativos++;
                sumaNegativos=sumaNegativos+num;
            }
            k++;
        }
        if(cantidadPositivos==0) System.out.println("No se puede calcular el promedio de los positivos!");
        else {
            promedioPositivo=sumaPositivos/cantidadPositivos;
            System.out.println("El promedio de los positivos es: "+promedioPositivo);
        }
        if(cantidadNegativos==0) System.out.println("No se puede calcular el promedio de los negativos!");
        else {
            promedioNegativo=sumaNegativos/cantidadNegativos;
            System.out.println("El promedio de los negativos es: "+promedioNegativo);
        }
        System.out.println("La cantidad de ceros es: " + cantidadCeros);
    }
}
