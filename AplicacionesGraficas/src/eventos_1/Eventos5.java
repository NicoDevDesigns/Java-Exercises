package eventos_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Eventos5 {
    public static void main(String[] args) {
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoEstado extends JFrame {
    public MarcoEstado() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        CambioEstado nuevo_estado = new CambioEstado();
        addWindowStateListener(nuevo_estado);
    }
}

class CambioEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState());

        if(e.getNewState()== Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta en pantalla completa");
        } else if (e.getNewState()==Frame.NORMAL) {
            System.out.println("La ventana esta normal");
        } else if (e.getNewState()==Frame.ICONIFIED) {
            System.out.println("La ventana esta minimizada");
        }
    }

}
