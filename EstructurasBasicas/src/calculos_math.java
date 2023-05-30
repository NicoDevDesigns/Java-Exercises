
public class calculos_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz= Math.sqrt(9.0);
		System.out.println(raiz);
		
		double num1= 5.79;
		
		long resultado= Math.round(num1);//redondeo
		System.out.println(resultado);
		
		int resultado2=(int)Math.round(num1);//refundicion
		System.out.println(resultado2);
		
		double base= 3;
		double exponente = 3;
		
		int resultado3=(int)Math.pow(base, exponente);
		System.out.println(resultado3);

	}

}
