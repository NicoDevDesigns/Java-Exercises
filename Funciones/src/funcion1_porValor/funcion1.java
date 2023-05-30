package funcion1_porValor;

public class funcion1 {
    public static void main(String[] args) {
        aprovechaElDia();
        int i=10;
        System.out.println(multiplicarNumero(i));
        System.out.println("valor de i fuera de la funcion = " + i);
        funcionPorValor(i);
        System.out.println("valor de i fuera de la funcion = " + i);

    }
    public static void funcionPorValor(int i){
        i=66;
        System.out.println("valor de i dentro de la funcion = " + i);
    }
    public static void aprovechaElDia(){
        System.out.println("Hola nico soy el mundo, no olvides una cosa. " +
                "APROVECHA EL MALDITO DIA");
    }
    public static int multiplicarNumero(int numero){
        return numero*2;
    }
}
