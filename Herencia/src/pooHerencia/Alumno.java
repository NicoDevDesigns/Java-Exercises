package pooHerencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){}

    public Alumno(String nombre){
        super(nombre);
        System.out.println("ALumno: inicalizando contructor..");
    }
    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }
    public Alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
    }
    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre,apellido,edad);
        this.institucion=institucion;
    }
    public Alumno(String nombre, String apellido, int edad,
                  String institucion,double notaMatematicas,
                  double notaCastellano,double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematicas=notaMatematicas;
        this.notaCastellano=notaCastellano;
        this.notaHistoria=notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
    @Override
    public String saludar(){
        String saludar=super.saludar();
        return saludar + " Hola Mundo, soy nico" + getNombre();
    }
    public double calcularPromedio(){
        return (notaHistoria+notaCastellano+notaMatematicas)/3;
    }
}
