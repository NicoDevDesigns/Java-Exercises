package whileMedia;

import java.util.Scanner;

public class WhileMedia {
    public static void main(String[] args) {
        int num=0,suma=0,cantNumeros=0;
        double media=0;
        System.out.println("Introduzca un numero positivo: ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        while(num>0){
            suma=suma+num;
            cantNumeros++;
            System.out.println("Introduzca otro numero: ");
            num=sc.nextInt();
        }
        if(cantNumeros==0){
            System.out.println("No se puede calcular la media!");
        }else {
            media=suma/cantNumeros;
            System.out.println("La media es: "+media);
            System.out.println("La cantidad de numeros es: "+cantNumeros);
        }
    }
}
