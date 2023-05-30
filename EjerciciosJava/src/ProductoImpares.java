package productoImpares;

public class ProductoImpares {
    public static void main(String[] args) {
        long productoImpares=1;
        for(int i=1;i<20;i+=2){
            productoImpares=productoImpares*i;
        }
        System.out.println("El resultado de multiplicar los primeros 10 numeros es: "+ productoImpares);
    }
}
