package poo;
import javax.swing.*;

public class UsosVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Coche ford=new Coche();//instanciar una clase
		
		System.out.println(ford.get_valor());
		
		//System.out.println("Ruedas "+ford.ruedas+" total");
		
		Coche chevi=new Coche();
		
		chevi.set_color(JOptionPane.showInputDialog("Ingresa el color: "));
		System.out.println(chevi.get_color());
		
		chevi.setTipoAsiento(JOptionPane.showInputDialog("Tiene asiento de cuero?: "));
		System.out.println(chevi.getTipoAsiento());
		
		chevi.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?: "));
		System.out.println(chevi.getClimatizador());
		
		System.out.println("El precio del chevi es: "+chevi.getPrecioCoche());
*/
		Coche miCoche1= new Coche();
		miCoche1.set_color("Rojo");
		
		Furgoneta miFurgoneta1=new Furgoneta(5,66);
		miFurgoneta1.set_color("Azul");
		miFurgoneta1.setTipoAsiento("si");
		miFurgoneta1.configuraClimatizador("si");
		
		System.out.println(miCoche1.get_valor()+miCoche1.get_color());
		System.out.println(miFurgoneta1.get_valor()+ miFurgoneta1.dimeDatos());
	}

}
