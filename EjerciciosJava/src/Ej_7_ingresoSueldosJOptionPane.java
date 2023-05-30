import javax.swing.*;

public class Ej_7_ingresoSueldosJOptionPane {
    public static void main(String[] args) {
        int cantidadSueldos=0;
        int sueldo=0, sueldoMaximo=0;
        int sueldosTotal = 0;
        boolean primerSueldo = false;
        cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de sueldos?"));
        for(int i=1;i<=cantidadSueldos;i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Introducce el sueldo: "));
            if(primerSueldo==false){
                sueldoMaximo=sueldo;
                primerSueldo=true;
            }
            if(sueldo>sueldoMaximo)sueldoMaximo=sueldo;
            sueldosTotal = sueldosTotal +sueldo;
        }
        JOptionPane.showMessageDialog(null,"El sueldo mayor es: "+sueldoMaximo);
        JOptionPane.showMessageDialog(null,"La suma de los sueldos es: "+sueldosTotal);

    }
}
