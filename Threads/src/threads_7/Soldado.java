package threads_7;

public class Soldado extends Personaje implements Runnable{

    private int numeroMedallas;

    public Soldado(){}
    public Soldado(int numeroMedallas,String nombre,int nivelVida){

        super(nombre,nivelVida);
        this.numeroMedallas=numeroMedallas;
        Thread t1 = new Thread(this);
        t1.start();
    }


    @Override
    public void run() {

        while(getNivelVida()>0){
            System.out.println("Se esta jugando el soldado"+getNombre());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
            setNivelVida(getNivelVida()-1);
        }

    }

    public static void main(String[] args) {
        new Soldado(10,"soldado 1",30);
        new Soldado(12,"soldado 2",25);
    }
}
