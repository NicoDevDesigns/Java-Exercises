package aplicacionesGraficas;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoColor miMarco=new MarcoColor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}
class MarcoColor extends JFrame{
	public MarcoColor() {
		setTitle("Prueba color");
		setSize(400,400);
		LaminaColor miLamina=new LaminaColor();
		add(miLamina);
		miLamina.setBackground(Color.PINK);
	}
}
class LaminaColor extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		//Dibujo rectangulo
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		//dibujo elipse
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setColor(new Color(109,172,59).brighter());
		g2.fill(elipse);
		
	}
	
}
