import java.util.Scanner;

public class Login{
  public static void main(String args[]){
   
   String usuario = "", password = "";
   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingresa tu nombre: ");
   usuario = entrada.nextLine();

   System.out.print("Ingresar tu contraseña: ");
   password = entrada.nextLine();

   if(usuario.equals("Nicolas") && password.equals("12345")){
    System.out.println("Inicio de seseion correcto");
  }else {
    System.out.println("Nombre de usuario o contraseña incorrectos");
  }
 }
}