package poo;

public class EmpleadoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefeRRHH= new Jefatura("Jorge",2000);
		
		jefeRRHH.estableceIncentivo(100);
		
		Empleados empleado1=new Empleados("Nico",1000);
		Empleados empleado2=new Empleados("Leo",2000);
		Empleados empleado3=jefeRRHH;
		
		System.out.println(empleado1.devuelveDatos());
		System.out.println(empleado2.devuelveDatos());

	}

}

class Empleados{
	
	//Atributos
	private final String nombre;
	private String seccion;
	private int id;
	private int sueldo;
	private static int idSiguiente=1;
	
	//Constructor
	public Empleados(String nombre,int sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	//Metodos
	public void cambiarSeccion(String seccion) {
		this.seccion=seccion;
	}
	public String devuelveDatos() {
		return"Nombre: "+nombre+" seccion: "+seccion+" Id: "+id;
	}
	public double dameSueldo() {
		return sueldo;
	}
	
}
class Jefatura extends Empleados{
	
	public Jefatura(String nom,int sue) {
		super(nom,sue);
	}
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe +incentivo;
	}
	private double incentivo;
}
