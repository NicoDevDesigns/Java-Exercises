package eventos_1;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Eventos7_eventoRaton {
    public static void main(String[] args) {

        MarcoRaton miMarco = new MarcoRaton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoRaton extends JFrame {
    public MarcoRaton(){
        setVisible(true);
        setBounds(400,200,600,450);
        EventosDeRaton eventoRaton = new EventosDeRaton();
        addMouseListener(eventoRaton);
    }
}
class EventosDeRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("acabas de presionar");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("acabas de levantar");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("acabas de entrar");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("acabas de salir");

    }
}

