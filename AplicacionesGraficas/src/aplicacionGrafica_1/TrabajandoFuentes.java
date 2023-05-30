package aplicacionesGraficas;
import java.awt.*;
import javax.swing.*;

public class TrabajandoFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFuentes miMarco=new MarcoFuentes();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		

	}

}
class MarcoFuentes extends JFrame{
	public MarcoFuentes() {
		setTitle("Prueba de fuentes");
		setSize(400,400);
		LaminaFuentes miLamina=new LaminaFuentes();
		add(miLamina);
		
		
	}
}
class LaminaFuentes extends JPanel{
	public void paintComponet(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Font miFuente=new Font("Courier",Font.BOLD,26);
		g2.setFont(miFuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Nico", 200, 200);
		
	}
}
