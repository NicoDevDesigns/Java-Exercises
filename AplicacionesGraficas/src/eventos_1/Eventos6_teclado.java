//Eventos de teclado, presionar una tecla y ver generar una respuesta
package eventos_1;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Eventos6_teclado {
    public static void main(String[] args) {
        MarcoTeclas miMarco = new MarcoTeclas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
class MarcoTeclas extends JFrame {
    public MarcoTeclas(){
        setVisible(true);
        setBounds(500,200,600,450);
        EventoDeTeclado teclado = new EventoDeTeclado();
        addKeyListener(teclado);
    }
}
//Clase oyente
class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println("La letra es: "+letra);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigoTecla = e.getKeyCode();
        System.out.println("El numero de la tecla es: "+codigoTecla);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
