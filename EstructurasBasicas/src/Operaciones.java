import java.util.Scanner;

public class Operaciones{
  public static void main(String args[]){
   
   Scanner entrada = new Scanner(System.in);
   int numUno = 0, numDos = 0, resultado = 0;
   int parametro = 0;

   
   System.out.println("Ingresa dos numeros enteros: ");
   System.out.println("Primer numero es: ");
   numUno = entrada.nextInt();
   System.out.println("Segundo numero es: ");
   numDos = entrada.nextInt();

   System.out.println("Que tipo de Operacion quieres hacer: ");
   System.out.println("1 es suma, 2 es resta, 3 es multiplicacion y 4 es division");
   parametro = entrada.nextInt();

   switch(parametro){
    
    case 1: resultado = numUno + numDos;
            System.out.println("Resultado de la suma es " + resultado);  
            break;

    case 2: resultado = numUno - numDos;
            System.out.println("El resultado de la resta es " + resultado);
            break;
    
    case 3: resultado = numUno * numDos;
            System.out.println("El rsultado de la multiplicacion es " + resultado);
            break;
    
    case 4: resultado = numUno / numDos;
            System.out.println("El resultado de la division es " + resultado);
            break;

    default: System.out.println("Error, la opcion no existe");
            break;       
  } 
 }
}