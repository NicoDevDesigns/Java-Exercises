package threads_6;

public class MultiplesThreads extends Thread{

    private String mensaje;
    private int contador;
public MultiplesThreads(String mensaje,int contador){
    this.mensaje=mensaje;
    this.contador=contador;
}
    @Override
    public void run() {

    while(contador>0){
        try {
            System.out.println("Mensaje: "+mensaje);
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.err.println("Error: "+e.getMessage());
        }
        --contador;
      }
    }

    public static void main(String[] args) {
        new MultiplesThreads("Threads 1",15).start();
        new MultiplesThreads("Threads 2",20).start();

    }
}
