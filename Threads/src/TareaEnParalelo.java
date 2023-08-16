import threads_8.Empleado;

public class TareaEnParalelo {
    public static void main(String[] args) {

        Thread empleado1 = new Thread(new Empleado("Nico"));
        Thread empleado2 = new Thread(new Empleado("Leo"));
        Thread empleado3 = new Thread(new Empleado("Mailo"));


        empleado1.start();
        empleado2.start();
        empleado3.start();




    }
}
