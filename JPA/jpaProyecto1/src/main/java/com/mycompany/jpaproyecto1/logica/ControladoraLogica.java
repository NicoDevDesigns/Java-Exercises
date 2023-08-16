
package com.mycompany.jpaproyecto1.logica;

import com.mycompany.jpaproyecto1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    public ArrayList<Alumno> traerListaAlumno (){
        return controlPersis.traerListaAlumnos();
    }
}
