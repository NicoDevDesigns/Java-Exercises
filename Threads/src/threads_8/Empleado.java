package threads_8;

public class Empleado implements Runnable{
    private String nombre;
    public Empleado(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void run() {
        System.out.println(nombre+" ha comenzado a trabajar.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Finalizo el trabajo "+nombre);

    }
}
