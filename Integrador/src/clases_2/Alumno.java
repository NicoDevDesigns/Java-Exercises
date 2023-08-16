package clases_2;

public class Alumno extends Persona{

    private String institucion;

    public Alumno(){};
    public Alumno(String nombre,int edad,String institucion){
        super(nombre,edad);
        this.institucion=institucion;
    }
    public void setInstitucion(String nuevoInstitucion){
        institucion=nuevoInstitucion;
    }
    public String getInstitucion(){
        return "El nombre de la institucion es: "+institucion;
    }


}
