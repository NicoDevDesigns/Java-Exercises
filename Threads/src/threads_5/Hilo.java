package threads_5;

import java.util.concurrent.ThreadLocalRandom;

public class Hilo extends Thread{

    @Override
    public void run() {

        try {
            int randomNum = ThreadLocalRandom.current().nextInt(2000,5000 + 1);
            System.out.println("Hola soy un hilo");
            Thread.sleep(randomNum);
            System.out.println("Hola soy un hilo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
