package ar.nico.clases2;

public class Profesor extends Persona{
    private String tipoMateria;

    public Profesor(String nombre,int edad,String tipoMateria){
        super(nombre,edad);
        this.tipoMateria=tipoMateria;
    }
    public void setTipoMateria(String nuevaMateria){
        tipoMateria=nuevaMateria;
    }
    public String getTipoMateria(){
        return "La nueva materia es que dicta es: "+ tipoMateria;
    }
    public String getValoresProfesor(){
        return "El nombre del profesor: "+ getNombre()+
                " La edad es: "+getEdad()+" y "+getTipoMateria();
    }
}
