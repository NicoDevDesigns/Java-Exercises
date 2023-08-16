package threads_8;

public class MiRunnable implements Runnable{
    @Override
    public void run() {
        for (int k=0;k<10;k++){
            System.out.println("Hola soy hilo Runnable");
        }
    }
}
