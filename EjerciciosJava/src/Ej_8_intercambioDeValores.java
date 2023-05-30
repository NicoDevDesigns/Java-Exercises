public class Ej_8_intercambioDeValores {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int aux=0;

        System.out.println("***********Antes****************************");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        aux = a;
        a=b;
        b=aux;

        System.out.println("***********Despues****************************");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

}
