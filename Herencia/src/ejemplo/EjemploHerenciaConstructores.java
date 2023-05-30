package ejemplo;

import ar.nico.pooHerencia.Alumno;
import ar.nico.pooHerencia.AlumnoInternacional;
import ar.nico.pooHerencia.Persona;
import ar.nico.pooHerencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("******Creando instancia alumno ****");
        Alumno alumno = new Alumno("Nico","Sanchez",37,"IndustriesNico");

        alumno.setNotaCastellano(7.0);
        alumno.setNotaHistoria(9.0);
        alumno.setNotaMatematicas(8.0);
        alumno.setEmail("loki@asgard.com");

        System.out.println("******Creando instancia alumnoInternacional ****");
        AlumnoInternacional alumInt = new AlumnoInternacional("carlos","perez","Noruega");

        alumInt.setEdad(33);
        alumInt.setInstitucion("Barcelona");
        alumInt.setNotaIdiomas(7.9);
        alumInt.setNotaCastellano(6.2);
        alumInt.setNotaHistoria(5.8);
        alumInt.setNotaMatematicas(7.8);
        alumInt.setEmail("thor@asgard.com");

        System.out.println("******Creando instancia profesor ****");
        Profesor profesor = new Profesor("Leo","sanchez","musico");
        profesor.setEdad(40);
        profesor.setEmail("odin@asgard.com");

        System.out.println("*****************************");
        imprimir(alumno);
        imprimir(alumInt);
        imprimir(profesor);
    }
    public static void imprimir(Persona persona){
        System.out.println("*****Impriendo datos en comun de persona*****");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellidos());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Email: "+persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("*******Imprimiendo los datos del tipo Alumno******");
            System.out.println("Institucion: "+((Alumno)persona).getInstitucion());
            System.out.println("Nota matematicas: "+ ((Alumno)persona).getNotaMatematicas());
            System.out.println("Nota historia"+ ((Alumno)persona).getNotaHistoria());
            System.out.println("Nota castellano: "+ ((Alumno)persona).getNotaCastellano());


            if(persona instanceof AlumnoInternacional){
                System.out.println("****Imprimiendo los datos del tipo AlumnoInternacional*****");
                System.out.println("Nota idiomas: "+((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: "+ ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("**********Sobre escritura promedio************");
            System.out.println("Promedio: "+((Alumno) persona).calcularPromedio());
            System.out.println("***********************************************");
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo profesor: ");
            System.out.println("Asignatura: "+ ((Profesor) persona).getAsignatura());
        }
        System.out.println("************************** Sobre escritura saludar ************************************");
        System.out.println(persona.saludar());
        System.out.println("**************************************************************");
    }
}
