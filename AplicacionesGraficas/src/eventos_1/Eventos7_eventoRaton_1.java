package eventos_1;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Eventos7_eventoRaton_1 {
    public static void main(String[] args) {

        MarcoRaton2 miMarco = new MarcoRaton2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoRaton2 extends JFrame {
    public MarcoRaton2(){
        setVisible(true);
        setBounds(400,200,600,450);
        EventosDeRaton2 eventoRaton = new EventosDeRaton2();
        EventosDeRaton3 objetoRaton = new EventosDeRaton3();
        addMouseListener(eventoRaton);
        addMouseMotionListener(objetoRaton);
    }
}
class EventosDeRaton2 extends MouseAdapter {
    public void mouseClicked(MouseEvent e){
        System.out.println("Coordenada X: "+e.getX()+ " Coordenada Y: "+e.getY());
        System.out.println(e.getClickCount());
    }
    public void mousePressed(MouseEvent e){
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Has pulsado el boton izquierdo");
        } else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Has pulsado la rueda del raton");
        } else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Has pulsado el boton derecho");
        }

    }
}
class EventosDeRaton3 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando el raton");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el raton");

    }
}