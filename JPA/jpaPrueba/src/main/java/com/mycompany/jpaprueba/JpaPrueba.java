
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        /*Alumno alu = new Alumno(37,"Leo","Sanchez",new Date());
        control.crearAlumno(alu);*/
        Alumno al2 = new Alumno(20,"Sonic","Wolf",new Date());
        control.crearAlumno(al2);
        
        //control.eliminarAlumno(37);
        /*alu.setApellido("vegeta");
        control.editarAlumno(alu);*/
        
        System.out.println("--------Busqueda individual---------");
        Alumno alu= control.traerAlumno(15);
        System.out.println("El alumno es: "+ alu.toString());
        System.out.println("--------Busqueda de todos-----------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for(Alumno al : listaAlumnos){
            System.out.println("El alumno es: "+ al.toString());
        }
        System.out.println("-----------------------------");
    }
}
