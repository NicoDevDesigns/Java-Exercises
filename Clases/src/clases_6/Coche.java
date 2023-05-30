package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoTotal;
	private String color;
	private Boolean asientoCuero;
	private Boolean climatizador;
	private int pesoPlataforma;
	
	
	public Coche() {
		
		ruedas=4;
		largo=300;
		ancho=200;
		motor=300;
		pesoPlataforma=500;
	}
	public String get_valor(){//GETTER
		return "Las ruedas son: "+ ruedas+" El largo es: "+largo;
	}
	public void set_color(String nuevoColor) {//SETTER
		color=nuevoColor;
	}
	public String get_color() {
		return "El color es: "+color;
	}
	public void setTipoAsiento(String asientoCuero) {
		if(asientoCuero.equalsIgnoreCase("si")) {
			this.asientoCuero=true;
		}else {
			this.asientoCuero=false;
		}
	}
	public String getTipoAsiento() {
		if(asientoCuero==true) {
			return "tiene asiento de cuero";
		}else {
			return "No tiene asiento de cuero";
		}
	}
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	public String getClimatizador() {
		if(climatizador==true) {
			return "Tiene climatizador";
		}else {
			return "No tiene";
		}
	}
	public String DimePeso() {
		int pesoCarrocerria=500;
	    pesoTotal=pesoCarrocerria+pesoPlataforma;
	    
	    if(asientoCuero==true) {
	    	pesoTotal=pesoTotal+100;
	    }
	    if(climatizador==true) {
	    	pesoTotal=pesoTotal+60;
	    }
	    
	    return "El peso total es: "+ pesoTotal;
	}
	public int getPrecioCoche() {//getter
		int precioTotal=10000;
		
		if(asientoCuero==true) {
			precioTotal=+4000;
		}
		if(climatizador==true) {
			precioTotal=+3000;
		}
		return precioTotal;
	}
	

}
