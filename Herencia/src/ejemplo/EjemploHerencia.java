package ejemplo;

import ar.nico.pooHerencia.Alumno;
import ar.nico.pooHerencia.AlumnoInternacional;
import ar.nico.pooHerencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("******Creando instancia alumno ****");
        Alumno alumno = new Alumno();
        alumno.setNombre("Nico");
        alumno.setApellidos("Sanchez");
        alumno.setNotaCastellano(7.0);
        alumno.setNotaHistoria(9.0);
        alumno.setNotaMatematicas(8.0);

        System.out.println("******Creando instancia alumnoInternacional ****");
        AlumnoInternacional alumInt = new AlumnoInternacional();
        alumInt.setNombre(("carlos"));
        alumInt.setApellidos("perez");
        alumInt.setPais("Noruega");
        alumInt.setEdad(33);
        alumInt.setInstitucion("Barcelona");
        alumInt.setNotaIdiomas(7.9);
        alumInt.setNotaCastellano(6.2);
        alumInt.setNotaHistoria(5.8);
        alumInt.setNotaMatematicas(7.8);

        System.out.println("******Creando instancia profesor ****");
        Profesor profesor = new Profesor();
        profesor.setNombre("Leo");
        profesor.setApellidos("Sanchez");
        profesor.setAsignatura("Musico");

        System.out.println("Profesor: "+profesor.getNombre()+" "+profesor.getAsignatura());
        System.out.println("Alumno: "+alumno.getNombre()+" "+alumno.getApellidos());

        System.out.println(alumInt.getNombre()+" "+alumInt.getApellidos()+" "+alumInt.getInstitucion()+" "+alumInt.getPais());

        Class clase = alumInt.getClass();
        while(clase.getSuperclass()!=null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija+" es una clase hija de la clase padre "+padre);
            clase= clase.getSuperclass();
        }


    }
}
