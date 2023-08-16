
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersi.crearAlumno(alu);
    }
    public void eliminarAlumno(int id){
        controlPersi.eliminarAlumno(id);
    }
    public void editarAlumno(Alumno alu){
        controlPersi.editarAlumno(alu);
    }
    public Alumno traerAlumno(int id){
        return controlPersi.traerAlumno(id);
    }
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersi.traerListaAlumnos();
    }
    

}
