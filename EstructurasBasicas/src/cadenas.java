
public class cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="nicolas";
		System.out.println("Mi nombre es: "+nombre);
		System.out.println("Mi nombre tiene "+nombre.length()+" letras");
		System.out.println("La letra buscada es: "+nombre.charAt(4));
		
		int ultimaLetra;
		ultimaLetra=nombre.length();
		System.out.println("La ultima letra es: "+nombre.charAt(ultimaLetra-1));

	}

}
