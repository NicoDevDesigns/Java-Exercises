import java.util.*;
public class entradaDatos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad=entrada.nextInt();
		
		System.out.println("Nombre: "+nombre+" Edad: "+edad);
		

	}

}
