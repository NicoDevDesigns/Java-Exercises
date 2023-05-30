package poo;

public class Furgoneta extends Coche{
	
	private int capacidadCarga;
	private int plazasExtras;
	
	public Furgoneta(int plazasExtras,int capacidadCarga) {
		
		super();
		this.capacidadCarga=capacidadCarga; 
		this.plazasExtras=plazasExtras;
				
	}
	public String dimeDatos() {
		return "La capacidad de carga es: "+ capacidadCarga +" y las plazas son: "+plazasExtras;
	}

}
