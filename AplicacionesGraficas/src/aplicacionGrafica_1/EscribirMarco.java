package aplicacionesGraficas;
import javax.swing.*;
import java.awt.*;

public class EscribirMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto miMarco=new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("primer texto");
		Lamina milamina=new Lamina();
		add(milamina);
		
	}
}
class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hola Mundo soy Nico", 200, 200);
	}
}