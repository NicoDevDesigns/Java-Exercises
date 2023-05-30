import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioSiete extends JFrame implements ActionListener{
  private JLabel jlabel1, jlabel2, jlabel3;
  private JComboBox combo1, combo2, combo3;
  private JButton boton1;
  
  public FormularioSiete(){

   setLayout(null);
   jlabel1 = new JLabel("Rojo");
   jlabel1.setBounds(10,10,100,10);
   add(jlabel1);

   combo1 = new JComboBox();
   combo1.setBounds(120,10,50,30);
   for(int i = 0; i<=255; i++){
   combo1.addItem(String.valueOf(i));
  } 
   add(combo1);

   jlabel2 = new JLabel("Verde");
   jlabel2.setBounds(10,50,100,10);
   add(jlabel1);

   combo2 = new JComboBox();
   combo2.setBounds(120,50,50,30);
   for(int i = 0; i<=255; i++){
   combo2.addItem(String.valueOf(i));
  } 
   add(combo2); 

   jlabel3 = new JLabel("Azul");
   jlabel3.setBounds(10,90,100,10);
   add(jlabel3);

   combo3 = new JComboBox();
   combo3.setBounds(120,90,50,30);
   for(int i = 0; i<=255; i++){
   combo3.addItem(String.valueOf(i));
  } 
   add(combo3);

   boton1 = new JButton("Fijar color");
   boton1.setBounds(10,130,100,30);
   add(boton1);
   boton1.addActionListener(this);
 }
public void actionPerfomed(ActionEvent e){
   if(e.getSource() == boton1){
     String cad1 = combo1.getSelectedItem().toString();
     String cad2 = combo2.getSelectedItem().toString();
     String cad3 = combo3.getSelectedItem().toString();

     int rojo = Integer.parseInt(cad1);
     int verde = Integer.parseInt(cad2);
     int azul = Integer.parseInt(cad3);

     Color color1 = new Color(rojo,verde,azul);
     boton1.setBackground(color1);
  } 
 }
public static void main(String args[]){
   FormularioSiete formulario1 = new FormularioSiete();
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
 
 }  
}