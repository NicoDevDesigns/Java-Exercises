package aplicacionesGraficas;

import java.awt.Frame;

import javax.swing.*;

public class CrearMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class miMarco extends JFrame{
	public miMarco() {
		//setSize(500,300);
		//setLocation(500,300);
		setBounds(800,400,300,300);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Hola mundo soy Nico");
	}
}
