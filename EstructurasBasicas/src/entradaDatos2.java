import javax.swing.*;
public class entradaDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre: ");
		String edad=JOptionPane.showInputDialog("Introduce tu edad: ");
		
		System.out.println("Mi nombre: "+nombre+" edad: "+edad);
		
		int edad2=Integer.parseInt(edad);
		System.out.println("Mi nombre: "+nombre+" edad: "+(edad2+10));
		
		double edad3=Double.parseDouble(edad);
		
		System.out.println("Mi nombre: "+nombre+" la raiz de la edad es: "+(Math.sqrt(edad3)));
		
		

	}

}
