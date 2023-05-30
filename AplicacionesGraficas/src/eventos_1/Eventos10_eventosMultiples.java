package eventos_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Eventos10_eventosMultiples {
    public static void main(String[] args) {
        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}
class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setTitle("Prueba Acciones");
        setBounds(600,350,600,300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}
class PanelAccion extends JPanel{

    public PanelAccion(){
        AccionColor accionAmarillo = new AccionColor("Amarillo",new ImageIcon(),Color.yellow);
        AccionColor accionAzul = new AccionColor("Azul",new ImageIcon(),Color.blue);
        AccionColor accionRojo = new AccionColor("Rojo",new ImageIcon(),Color.RED);

    }
    /*public PanelAccion(){
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");

        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
    }

     */
}
class AccionColor extends AbstractAction{

    public AccionColor(String nombre,Icon icono,Color color_boton){
        putValue(Action.NAME,nombre);
        putValue(Action.SMALL_ICON,icono);
        putValue(Action.SHORT_DESCRIPTION,"Poner la lamina en color "+nombre);
        putValue("Color_de_fonde",color_boton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
