import java.util.Scanner;

public class Sistema{

  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");   
   System.out.println("Bienvenido al sistema vacacional de coca-cola Company");
   System.out.println("*****************************************************"); 
   System.out.println("*****************************************************");

   System.out.println("Cual es el nombre del trabajador?: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("Cuanto tiempo de servicio tiene el trabajador: " );
   antiguedad = entrada.nextInt();
   System.out.println("");

   System.out.print("Cual es la clave del trabajador?: ");
   clave = entrada.nextInt();
   System.out.println("");

   if(clave == 1){

     if(antiguedad >= 0 && antiguedad < 2){
       System.out.println("El trabajador " + nombre + " tiene derecho de 6 dias de vacaciones");
    } else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 14 dias de vacaciones");
    } else if(antiguedad > 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
    }    
  } else if(clave == 2){

      if(antiguedad >=0 && antiguedad < 2){
       System.out.println("El trabajador " + nombre + " tiene derecho a 8 dias de vacaciones"); 
     }else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 18 dias de vacaciones");
    
     }else if(antiguedad > 6){
     System.out.println("El trabajador " + nombre + " tiene derecho a 33 dias de vacaciones");
  }
 
  }else if(clave == 3){  
     if(antiguedad >= 0 && antiguedad < 2){
       System.out.println("El trabajador " +nombre + " tiene derecho a 8 dias de vacaciones"); 
     }else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
     }else if(antiguedad >6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 35 dias de vacaciones");
     }

  }else {
    System.out.println("La clave del departamento es incorrecto"); 
  }   
 }
}