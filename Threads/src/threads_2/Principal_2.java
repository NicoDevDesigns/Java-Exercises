package threads_2;

public class Principal_2 {
    public static void main(String[] args) {

        HiloNumerosLetras numeros = new HiloNumerosLetras(1);
        HiloNumerosLetras letras = new HiloNumerosLetras(2);

        Thread hilo1 = new Thread(numeros);
        Thread hilo2 = new Thread(letras);

        hilo1.start();
        hilo2.start();

    }
}
