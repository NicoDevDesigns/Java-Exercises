package poo;
import java.util.*;

public class UsoEmpleado {//clase principal

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1=new Empleado("Nico",1000,1985,5,28);
		Empleado empleado2=new Empleado("Leo",2000,1987,1,13);
		
		empleado1.subeSueldo(10);
		empleado2.subeSueldo(20);
		
		System.out.println("Nombre: "+empleado1.getDameNombre()
		+" Sueldo: "+empleado1.getDameSueldo()+" Fecha: "+empleado1.dameFechaContrato());
		System.out.println("Nombre: "+empleado2.getDameNombre()
		+" Sueldo: "+empleado2.getDameSueldo()+" Fecha: "+empleado2.dameFechaContrato());
		
		//version 2 mejorada
		
		Empleado[] misEmpleados=new Empleado[2];
	    misEmpleados[0]=new Empleado("Nico",1000,1985,5,28);
        misEmpleados[1]=new Empleado("Leo",2000,1987,1,13);
        
        for(int i=0;i<2;i++) {
        	misEmpleados[i].subeSueldo(10);
        }
        for(int i=0;i<2;i++) {
        	System.out.println("Nombre: "+misEmpleados[i].getDameNombre()
		+" Sueldo: "+misEmpleados[i].getDameSueldo()+" Fecha: "+misEmpleados[i].dameFechaContrato());
        }
		

	}

}
class Empleado{
	public Empleado(String nom,double sue,int agno,int mes,int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	public String getDameNombre() {//getter
		return nombre;
	}
	public double getDameSueldo() {//getter
		return sueldo;
	}
	public Date dameFechaContrato() {//getter
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}
