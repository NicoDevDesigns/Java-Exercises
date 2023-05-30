package pooSobrecarga;

public class ejemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        System.out.println("Sumar int = " + cal.suma(10,5));
        System.out.println("Sumar float = " + cal.suma(10f,5f));
        System.out.println("sumar float-int"+ cal.sumar(2.0f,8));
        System.out.println("sumar string" + cal.sumar("30","77"));
        System.out.println("Sumar varios argumentos: " + cal.sumar(2,3,4,5,6));
        System.out.println("Sumar n argumentos: "+ cal.sumar(3.4f,3,2,5,6,22));
        System.out.println("Sumar doble"+ cal.sumar(2.0,5.0,4.0));



    }
}
