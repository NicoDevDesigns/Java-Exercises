package excepciones_5;

import javax.swing.*;
import java.io.EOFException;

public class ComprobarMail {
    public static void main(String[] args) {

        String mail = JOptionPane.showInputDialog("Introduce un mail: ");
        try {
            examinaMail(mail);
        }catch (EOFException ex){
            System.out.println("El mail no es correcto");
        }

    }
    static void examinaMail(String mail) throws EOFException{
        int arroba=0;
        boolean punto= false;
        if(mail.length()<3){

            EOFException miException = new EOFException();
            throw miException;
            //throw new EOFException(); Linea resumida del arriba

        }else {
            for(int i=0;i<mail.length();i++){
                if(mail.charAt(i)=='@'){
                    arroba++;
                }
                if (mail.charAt(i)=='.'){
                    punto=true;
                }
            }
            if(arroba==1 && punto==true){
                System.out.println("Es correcto");
            }else {
                System.out.println("No es correcto");
            }
        }
    }
}
