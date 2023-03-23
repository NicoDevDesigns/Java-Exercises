package aplicacionGrafica_1;

import javax.swing.*;

public class ApGrafica1_crearMarco {
    public static void main(String[] args) {
        miMarco marco1= new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class miMarco extends JFrame{
    public miMarco(){
        setBounds(400,300,300,300);
        setTitle("Hola mundo!, soy Nico");
    }
}
