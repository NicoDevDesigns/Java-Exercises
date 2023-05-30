package poo1;

public class Complex {
	
	private int real;
	private int imag;
	
	public Complex(int valor1,int valor2) {
		real=valor1;
		imag=valor2;
	}
	
	public String getValores() {
		return "Real: "+real+" Imag: "+imag;
	}
	public void setReal(int r,int imag) {
		real=r;
		this.imag=imag;
	}

}
