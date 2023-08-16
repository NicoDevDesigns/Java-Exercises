package threads_8;

public class MiThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Hola soy hilo Thread");
        }
    }
}
