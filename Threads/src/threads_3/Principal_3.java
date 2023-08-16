package threads_3;

public class Principal_3 {
    public static void main(String[] args) throws InterruptedException {

        Contador contador1 = new Contador("contador 1",35);
        Contador contador2 = new Contador("contador 2",45);
        Contador contador3 = new Contador("contador 3",25);
        Contador contador4 = new Contador("contador 4",55);

        Thread hilo1 = new Thread(contador1);
        Thread hilo2 = new Thread(contador2);
        Thread hilo3 = new Thread(contador3);
        Thread hilo4 = new Thread(contador4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        }catch (InterruptedException ex){
            System.out.println("Ha ocurrido un error fatal");
        }
        System.out.println("Fin del programa!");


    }
}
