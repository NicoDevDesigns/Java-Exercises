package threads_4;

import java.util.Observable;

public class RelojDigital extends Observable implements Runnable {

    private int horas,minutos,segundos;

    public RelojDigital(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public void run() {
        String tiempo;
        while(true){
            tiempo="";
            if(horas<10){
                tiempo += "0" + horas;
            }else{
                tiempo += horas;
            }
            tiempo += ":";

            if(minutos<10){
                tiempo += "0" + minutos;
            }else{
                tiempo += minutos;
            }
            tiempo += ":";
            if(segundos<10){
                tiempo += "0" + segundos;
            }else{
                tiempo += segundos;
            }

            this.setChanged();
            this.notifyObservers();
            this.clearChanged();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            segundos++;
            if(segundos == 60){
                minutos++;
                segundos = 0;
                if(minutos == 60){
                    minutos = 0;
                    horas++;
                    if (horas==24){
                        horas=0;
                    }
                }
            }
        }

    }
}
