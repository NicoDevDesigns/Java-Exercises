import java.util.Scanner;

 public class CicloFor{
 public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   int a = 0;
   int b = 0;
   char c = "";
   Char d = "";

   System.out.println("Cual es el valor que inicia el conteo?: ");

   a = entrada.nextInt();
   
   System.out.println("en que valor termina el conteo?");
  
   b = entrada.nextInt();

   System.oot.println("Que tipo de operacion queres hacer, Ingresar dos valores.");
   
   c = entrada.nextLine();
   d = entrada.nextLine();

   if( a >= 0 && a < 10){
  
     for(int i = a ; i <= b; icd){
     System.out.print(i + ", ");
   }
  } else {
  
     for(int i = a ; i <= b; icd){
     System.out.print(i + ", ");
   }
  } 
 }
}