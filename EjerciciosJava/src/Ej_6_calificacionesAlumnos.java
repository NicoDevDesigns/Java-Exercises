import java.util.Scanner;

public class Ej_6_calificacionesAlumnos {
    public static void main(String[] args) {
        int aprobados=0;
        int reprobados=0;
        int excelentes=0;
        float calif=0;
        int i=1;
        Scanner sc = new Scanner(System.in);

        while (i<=6){
            System.out.println("Ingrese un numero: ");
            calif=sc.nextFloat();
            if(calif>=9 && calif <=10){
                excelentes++;
            } else if (calif>=6 && calif<9) {
                aprobados++;
            }else{
                reprobados++;
            }
            i++;
        }
        System.out.println("Cantidad de excelentes: "+excelentes);
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("CAntidad de reprobados: "+reprobados);
    }
}
