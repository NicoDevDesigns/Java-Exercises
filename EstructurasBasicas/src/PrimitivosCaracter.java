public class PrimitivosCaracter {
    public static void main(String[] args) {
        char caracter='\u0040';
        char decimal=64;

        System.out.println("caracter: " + caracter);
        System.out.println("decimal=caracter "+(caracter==decimal));

        char espacio='\u0020';
        char tabulador='\t';

        System.out.println("char byte: " + Character.BYTES);
    }
}
