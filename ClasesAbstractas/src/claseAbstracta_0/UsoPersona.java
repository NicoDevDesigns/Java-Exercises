package claseAbstracta_0;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Leo",10000);
		lasPersonas[1]=new Alumno("Nico","Inge");
		
		for(Persona p: lasPersonas) {
			System.out.println(p.dameNombre()+" "+p.dameDescripcion());
		}

	}

}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	public String dameNombre(){
		return nombre;
	}
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
	//Atributos
	//private final String nombre;
	private String seccion;
	private int sueldo;
	
	//Constructor
	public Empleado2(String nombre, int sueldo){
		//this.nombre=nombre;
		super(nombre);
		this.sueldo=sueldo;
		seccion="Administracion";
	}
	//Metodos
	
	public String dameDescripcion() {
		return "La seccion del empleado es: "+ seccion+ "El sueldo es: "+sueldo;
	}
	public void cambiarSeccion(String seccion) {
			this.seccion=seccion;
			}
	public String devuelveDatos() {
				return " seccion: "+seccion;
			}
	public double dameSueldo() {
				return sueldo;
			}
}
class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera=carrera;
	}
	public String dameDescripcion() {
		return "El alumno estudia: "+carrera;
	}
}
