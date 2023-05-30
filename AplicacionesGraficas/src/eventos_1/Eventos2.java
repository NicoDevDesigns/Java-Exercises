package ar.nico.aplicacionGrafica.ApGrafica2_eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos2 {
    public static void main(String[] args) {
        MarcoBotones miMarco= new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoBotonesDos extends JFrame{
    public MarcoBotonesDos(){
        setBounds(500,200,600,400);
        setTitle("Botones y eventos");
        LaminaBotonesDos miLamina =new LaminaBotonesDos();
        add(miLamina);
    }
}
class LaminaBotonesDos extends JPanel {
    JButton botonAzul = new JButton("Azul");
    JButton botonVerde = new JButton("Verde");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotonesDos() {
        add(botonAzul);
        add(botonVerde);
        add(botonRojo);
        ColorFondo Verde=new ColorFondo(Color.green);
        ColorFondo Azul=new ColorFondo(Color.blue);
        ColorFondo Rojo=new ColorFondo(Color.red);

        botonAzul.addActionListener(Azul);
        botonVerde.addActionListener(Verde);
        botonRojo.addActionListener(Rojo);
    }

   private class ColorFondo implements ActionListener {
        public ColorFondo(Color c) {
            colorDeFondo = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }

        private Color colorDeFondo;
    }
}
