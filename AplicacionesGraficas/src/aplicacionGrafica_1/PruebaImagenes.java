package aplicacionesGraficas;


import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen miMarco=new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoImagen extends JFrame{
	public MarcoImagen() {
		setTitle("Marco Imagen");
		setBounds(750,300,300,200);
		LaminaImagen miLamina=new LaminaImagen();
		add(miLamina);
	}
}
class LaminaImagen extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miImagen=new File("src/aplicacionesGraficas/magia.png");
		try {
		Imagen=ImageIO.read(miImagen);
		}catch(IOException e) {
			System.out.println("La imagen no se encuentra!");	
		}
		int anchoImagen=Imagen.getWidth(this);
		int altoImagen=Imagen.getHeight(this);
		
		
		g.drawImage(Imagen,0,0,null);
		for(int i=0;i<300;i++) {
			for(int j=0;j<200;j++) {
				g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i, altoImagen*j);
			}
		}
	}
private Image Imagen;
}
