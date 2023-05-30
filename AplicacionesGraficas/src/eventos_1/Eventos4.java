package eventos_1;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Eventos4 {
    public static void main(String[] args) {
        MarcoVentana2 miMarco=new MarcoVentana2();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MarcoVentana2 miMarco2=new MarcoVentana2();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        miMarco2.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(100,250,300,350);
        miMarco2.setBounds(700,250,300,350);
    }
}
class MarcoVentana2 extends JFrame {
    public MarcoVentana2(){
        //setTitle("Respondiendo");
        //setBounds(400,250,500,350);

        setVisible(true);
        //M_Ventana2 oyente_ventana= new M_Ventana2();
        //addWindowListener(oyente_ventana);

        addWindowListener(new M_Ventana2());
    }
}
class M_Ventana2 extends WindowAdapter {
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada!!");
    }
}
