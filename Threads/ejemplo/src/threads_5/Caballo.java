
package threads_5;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caballo extends Observable implements Runnable{
    
    private String nombre;
    
    public Caballo(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public void run() {
        
        int porcentaje = 0;
        int numeroAleatorio;
        try {
             while(porcentaje<100){
                numeroAleatorio = generarNumeroAleatorio(1,15);
                System.out.println("Caballo "+nombre+"Ha aumentado en "
                        +numeroAleatorio);
                porcentaje+=numeroAleatorio;

                this.setChanged();
                this.notifyObservers(porcentaje);
                this.clearChanged();

                Thread.sleep(1000);
                } 
        }catch (InterruptedException ex) {
                    System.out.println("Hilo interrumpido");
                
            }
            
            
        }
    public static int generarNumeroAleatorio(int minimo,int maximo){
        
        int num = (int) Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
        
    }
    
    
}
