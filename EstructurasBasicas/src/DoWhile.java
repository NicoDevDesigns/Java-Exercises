import java.util.Scanner;

public class DoWhile{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);

   int Valor = 0;
   System.out.println("**********************************");
   System.out.println("Bienvenidos a NicoElectric");
   System.out.println("**********************************");
   System .out.println("Ingrese un valor: ");
   Valor = entrada.nextInt();
   System.out.println("**********************************");
  
    if(Valor > 1000){
    do{
     System.out.print( Valor + ", ");
     Valor-=200;
   }while(Valor >= 0);
     } else {
    do{
     System.out.print( Valor + ", ");
     Valor+=100;
    }while(Valor < 1000);
   }
  }  
 }
