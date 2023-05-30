package eventos_1;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Eventos9_eventoFocoVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {

        Eventos9_eventoFocoVentana miV = new Eventos9_eventoFocoVentana();
        miV.iniciar();

    }
    public void iniciar(){
        marco1= new Eventos9_eventoFocoVentana();
        marco2= new Eventos9_eventoFocoVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(300,100,600,350);
        marco2.setBounds(1200,100,600,350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);


    }

    @Override
    public void windowGainedFocus(WindowEvent e) {

        if(e.getSource()==marco1){
            marco1.setTitle("Tengo el foco");
        }else {
            marco2.setTitle("Yo tengo el foco");
        }

    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if(e.getSource()==marco1){
            marco1.setTitle("No tengo el foco");
        }else {
            marco2.setTitle("yo ahora no tengo el foco");
        }
    }
    Eventos9_eventoFocoVentana marco1;
    Eventos9_eventoFocoVentana marco2;

}
