import javax.swing.*;

public class Ej_24_LeerDatosJOptionPane {
    public static void main(String[] args) {

        String nombre;
        String apellido;

        nombre= JOptionPane.showInputDialog("Ingresar tu nombre:");
        apellido = JOptionPane.showInputDialog("Ingresar apellido:");

        JOptionPane.showMessageDialog(null,"Tu nombre es: "+ nombre);
        JOptionPane.showMessageDialog(null,"El apellido: "+apellido);


    }
}
