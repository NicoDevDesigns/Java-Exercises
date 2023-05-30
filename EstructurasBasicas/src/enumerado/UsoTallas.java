package enumerado;

import java.util.Scanner;

public class UsoTallas {
	
	enum Talla{chico,mediano,grande,muyGrande};
	
	enum Talla2{
		MINI("S"),MEDIANO("M"),GRANDE("G"),MUYGRANDE("XL");
		private Talla2(String abreviatura) {
			this.abreviatura=abreviatura;
			
		}
		public String dameAbreviatura() {
			return abreviatura;
		}
		private String abreviatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Talla s=Talla.chico;
		Talla m=Talla.mediano;
		Talla g=Talla.grande;
		Talla y=Talla.muyGrande;
		
		System.out.println(s);
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Escribe una talla: MINI,MEDIADO,GRANDE,MUYGRANDE");
		String entradaDatos=entrada.next().toUpperCase();
		Talla2 laTalla=Enum.valueOf(Talla2.class, entradaDatos);
		System.out.println("Talla= "+laTalla);
		System.out.println("Abreviatura= "+ laTalla.dameAbreviatura());
		
	}

}
