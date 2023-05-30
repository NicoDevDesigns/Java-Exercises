import java.util.Scanner;

public class Vector{
  public static void main(String args[]){

   int numeros[] = new int[3];
   Scanner intro = new Scanner(System.in);

   
   for(int i = 0; i <= 3; i++){
   System.out.println("ingresar el " +i + " valor al vector");
   numeros[i] = intro.nextInt();
   
  }
 }
}