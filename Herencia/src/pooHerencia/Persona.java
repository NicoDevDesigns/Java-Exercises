package pooHerencia;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String email;

    public Persona(){}

    public Persona(String nombre){
        System.out.println("Persona: inicializando contructor");
    }

    public Persona(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    public Persona(String nombre, String apellidos, int edad){
        this(nombre, apellidos);
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String saludar(){
        return "Hola mundo soy nico!!";
    }
}
