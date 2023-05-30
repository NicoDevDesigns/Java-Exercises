package ar.nico.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String lanzarPelota(){
        return "lanzar la pelota al perro";
    }
    public static String saludar(){
        return "Hola mundo soy nico!!";
    }
    public static final String MASCULINO = "Masculino";
    public static final String FEMENINO = "Femenino";

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
}
