
package com.mycompany.jpaproyecto1;

import com.mycompany.jpaproyecto1.logica.Alumno;
import com.mycompany.jpaproyecto1.logica.ControladoraLogica;
import java.util.ArrayList;
import java.util.Date;


public class JpaProyecto1 {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
       
        //Alumno alu = new Alumno(10,"Nico", "Sanchez", new Date());
        //Alumno alu2 = new Alumno(12,"Leo", "lorien", new Date());

        //control.crearAlumno(alu);
        //control.crearAlumno(alu2);
        
        //control.eliminarAlumno(10);
        
        //alu2.setApellido("Sanchez");
        //control.editarAlumno(alu2);
        
        Alumno alu = control.traerAlumno(10);
        System.out.println("******Busqueda individual******");
        System.out.println("El alumno es: "+alu.toString());
        
        System.out.println("********Busqueda de todos**********");
        
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumno();
        for(Alumno al: listaAlumnos){
            System.out.println("El alumno es: "+al.toString());
        }
        System.out.println("***********************************");
       
       
    }
}
