package aplicacionesGraficas;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;


public class DibujoMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoDibujo miMarco=new MarcoDibujo();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoDibujo extends JFrame{
	public MarcoDibujo() {
		setTitle("Prueba dibujo");
		setSize(400,300);
		setLocation(200,400);
		LaminaFiguras miLamina=new LaminaFiguras();
		add(miLamina);
	}
}
class LaminaFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200);
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.draw(rectangulo);
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double centroX=rectangulo.getCenterX();
		double centroY=rectangulo.getCenterY();
		double radio=150;
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);
		
		
	}

}

