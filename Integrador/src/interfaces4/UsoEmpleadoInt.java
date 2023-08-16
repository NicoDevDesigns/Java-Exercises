package interfaces;

public class UsoEmpleadoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoInt empleado1=new EmpleadoInt("Nico",100);
		JefaturaInt jefe1=new JefaturaInt("Leo",200);
		
		System.out.println(jefe1.dameNombre());
		System.out.println(jefe1.tomarDesicion("Tomate el dia"));

	}

}
class EmpleadoInt{
	private String nombre;
	private double sueldo;
	
	public EmpleadoInt(String nombre,double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	public String dameNombre() {
		return "El nombre es: "+nombre;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
}
class JefaturaInt extends EmpleadoInt implements jefes{
	
	private double incentivo;
	
	public JefaturaInt(String nom,double sue) {
		super(nom,sue);
	}
	public String tomarDesicion(String desicion) {
		return "La desicion es: "+ desicion;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo()+incentivo;
		return sueldoJefe;
	}
	
}

