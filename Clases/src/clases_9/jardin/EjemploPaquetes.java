package ar.nico.app.jardin;
//import ar.nico.app.hogar.Gato;
import ar.nico.app.hogar.ColorPelo;
import ar.nico.app.hogar.Persona;
import ar.nico.app.hogar.Persona.*;
import static ar.nico.app.hogar.Persona.FEMENINO;
import static ar.nico.app.hogar.Persona.MASCULINO;
import static ar.nico.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        //ar.nico.app.hogar.Persona p = new ar.nico.app.hogar.Persona();
        Persona p = new Persona();
        p.setNombre("Nico");
        p.setColorPelo(ColorPelo.RUBIO);
        System.out.println(p.getNombre());
        //Gato g = new Gato();
        Perro perro = new Perro();
        perro.nombre="Mailo";
        perro.raza="noIndentificado";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo= Persona.saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer =    Persona.FEMENINO;



    }
}
