import java.util.Scanner;

public class MatrizDinamica{
  public static void main(String args[]){
   
  Scanner entrada = new Scanner(System.in);
  int filas    = 0;
  int columnas = 0;

  System.out.println("Cuantas filas deseas: ");
  filas = entrada.nextInt();

  System.out.println("Cuantas columnas deseas: ");
  columnas = entrada.nextInt();
  

  int numeros[][] = new int[filas][columnas]; 

  for(int j = 0; j < filas; j++){
    for(int i = 0; i < columnas; i++){
     System.out.println(" Ingresar el valor de la posicion:" +j+i);
     numeros[j][i] = entrada.nextInt() ;
     }
    }
  for(int j = 0; j < filas; j++){
    for(int i = 0; i < columnas; i++){
     
     System.out.print("["+ numeros[j][i]+"]"); 
    
   }
     System.out.println("");
  }
 }
}