import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese tres nombres: ");
        System.out.println("Primero:");
        String nombre1=scanner.nextLine();
        /*System.out.println("Segundo:");
        String nombre2=scanner.nextLine();
        System.out.println("Tercero: ");
        String nombre3=scanner.nextLine();*/

        //System.out.println(nombre1+nombre2+nombre3);

        char[] nombre1Array=nombre1.toCharArray();
        System.out.println(nombre1Array[1]);





    }
}
