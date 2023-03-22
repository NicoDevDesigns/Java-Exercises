package ar.nico.clases2;

public class PrincipalHumano {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Nico",37,"UTN");
        System.out.println(alumno1.getInstitucion());
        alumno1.setInstitucion("UBA");
        System.out.println(alumno1.getInstitucion());

        //Crear un objeto profesor
        System.out.println("***********************************************");
        Profesor nicoProfesor=new Profesor("Nico",37,"Matematicas");
        System.out.println(nicoProfesor.getTipoMateria());
        System.out.println(nicoProfesor.getValoresProfesor());
    }
}
