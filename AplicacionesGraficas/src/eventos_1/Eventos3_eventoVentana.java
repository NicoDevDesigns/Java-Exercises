package ar.nico.aplicacionGrafica.ApGrafica2_eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Eventos3_eventoVentana {
    public static void main(String[] args) {
        MarcoVentana miMarco=new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MarcoVentana miMarco2=new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        miMarco.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(100,250,300,350);
        miMarco2.setBounds(700,250,300,350);

    }
}
class MarcoVentana extends JFrame{
    public MarcoVentana(){
        //setTitle("Respondiendo");
        //setBounds(400,250,500,350);

        setVisible(true);
        M_Ventana oyente_ventana= new M_Ventana();
        addWindowListener(oyente_ventana);
    }
}
class M_Ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta!!!");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana!!");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada!!");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada!!");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada!!");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada!!");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada!!");

    }
}