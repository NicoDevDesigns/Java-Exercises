import java.util.Scanner;

public class Ej_18_estacionamientoPagar {
    public static void main(String[] args) {
        double costoTotal=0;
        int horas=0;
        double pesos=0;
        Scanner ingresarHoras = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de horas: ");
        horas= ingresarHoras.nextInt();

        costoTotal = calculoPrecio(horas);

        System.out.println("El costo total es: "+costoTotal);
    }
    public static double calculoPrecio(int horas){
        double total=0;
        if(horas<=3 && horas>0){
            total = horas*20;
        }else if (horas>3 && horas<24) {
            total=(horas-3)*15+3*20;
        } else if (horas==24) {
            total=250;
        } else if (horas>24) {
            int dia = horas/24;
            double restoHoras= horas%24;
            total=(dia*250)+restoHoras*15;
        }else {
            System.out.println("Numero ingresado es incorrecto");
        }
        return total;
    }
}
