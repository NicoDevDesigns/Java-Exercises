import java.util.Scanner;

public class CicloWhile{
  public static void main(String arg[]){
 
   Scanner entrada = new Scanner(System.in);
   int i = 0;

   System.out.println("Ingresar valor de inicio");

   i = entrada.nextInt();
  
   System.out.println("La sucecion de valores es : ");
     
   while(i < 10){
  
   System.out.println(i + ", ");
   i+=2;
  }
 }
}