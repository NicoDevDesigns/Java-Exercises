import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr= JOptionPane.showInputDialog(null,"Ingrese numero entero: ");
        int numeroDecimal=0;
        try{
            numeroDecimal=Integer.parseInt((numeroStr));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        System.out.println("Numero decimal: "+ numeroDecimal);

        System.out.println("Numero binario de "+numeroDecimal+" = "+ Integer.toBinaryString(numeroDecimal));

        String mensaje= "Numero binario de "+numeroDecimal+" = "+ Integer.toBinaryString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);

        String resultadoOctal="Numero octal de "+ numeroDecimal+ " = " +Integer.toOctalString(numeroDecimal);
        JOptionPane.showMessageDialog(null,resultadoOctal);
        System.out.println(resultadoOctal);
    }
}
