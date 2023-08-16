package threads_5;

public class Principal {
    public static void main(String[] args) {

        Hilo hilo1 = new Hilo();
        hilo1.start();

        Ejecutable ejecutable1 = new Ejecutable();
        Thread thread = new Thread(ejecutable1);
        thread.start();



    }
}
