package threads_8;

public class Principal {
    public static void main(String[] args) {

        MiThread miHilo = new MiThread();
        miHilo.start();

        MiRunnable miHilo2 = new MiRunnable();
        Thread miThread = new Thread(miHilo2);
        miThread.start();

        //Hilo principal
        for (int j=0;j<10;j++){
            System.out.println("Hola soy Hilo principal");
        }

    }
}
