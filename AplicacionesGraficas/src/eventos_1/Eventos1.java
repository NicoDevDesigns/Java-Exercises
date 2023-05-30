package ar.nico.aplicacionGrafica.ApGrafica2_eventos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Eventos1 {
    public static void main(String[] args) {
        MarcoBotones miMarco= new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setBounds(500,200,600,400);
        setTitle("Botones y eventos");
        LaminaBotones miLamina =new LaminaBotones();
        add(miLamina);
    }
}
class LaminaBotones extends JPanel implements ActionListener {
    JButton botonAzul=new JButton("Azul");
    JButton botonVerde=new JButton("Verde");
    JButton botonRojo=new JButton("Rojo");

    public LaminaBotones(){
        add(botonAzul);
        botonAzul.addActionListener(this);
        add(botonVerde);
        botonVerde.addActionListener(this);
        add(botonRojo);
        botonRojo.addActionListener((this));

    }
    public void actionPerformed(ActionEvent e){
        setBackground(Color.blue);
        Object botonPulsado=e.getSource();
        if(botonPulsado==botonAzul){
            setBackground(Color.blue);
        }else if (botonPulsado==botonVerde){
            setBackground(Color.green);
        }else {
            setBackground(Color.red);
        }
    }

}