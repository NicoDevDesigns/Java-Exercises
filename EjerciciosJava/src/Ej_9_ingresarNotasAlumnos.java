/*Crear programa que analize si el alumno con determinada nota a reprobado*/
import javax.swing.*;

public class Ej_9_ingresarNotasAlumnos {
    public static void main(String[] args) {
        int calificacion=0;
        String nombreAlumno=" ";
        boolean reprobado = false;
        for (int i = 0;i<2;i++){
            nombreAlumno= JOptionPane.showInputDialog("Alumno "+(i+1)+" Ingresa nombre: ");
            calificacion=Integer.parseInt(JOptionPane.showInputDialog("Introducir nota: "));
            if(calificacion<6)reprobado=true;
            if (reprobado==true){
                JOptionPane.showMessageDialog(null,"El alumno "+nombreAlumno+" ha reprobado");
            }else {
                JOptionPane.showMessageDialog(null,"El alumno aprobo!");
            }
        }
    }
}
