package aplicacionesGraficas;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco=new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}
class Marco extends JFrame{
	public Marco() {
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		setTitle("Marco Centrado");
		//Image miIcono=miPantalla.getImage();
		
	}
}
