package eventos_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Eventos8_eventoDeFoco {
    public static void main(String[] args) {
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoFoco extends JFrame{
    public MarcoFoco (){
        setVisible(true);
        setBounds(350,200,600,450);
        add(new laminaFoco());
    }
}
class laminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);

        add(cuadro1);
        add(cuadro2);

        LanzarFocos elFoco = new LanzarFocos();
        cuadro1.addFocusListener(elFoco);
    }
    class LanzarFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Tengo el foco");

        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText();
            boolean comprobacion = false;
            for (int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    comprobacion=true;
                }
            }
            if(comprobacion){
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto");
            }

        }
    }
    JTextField cuadro1;
    JTextField cuadro2;
}

