package threads_2;

public class HiloNumerosLetras implements Runnable{

    private int tipo;
    public HiloNumerosLetras(int tipo) {
        this.tipo = tipo;
    }


    @Override
    public void run() {
        while(true){
            switch(tipo){
                case 1:
                    for(int i=1;i<30;i++){
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (char c ='a';c<'z';c++){
                        System.out.println(c);
                    }
                    break;
            }
        }

    }
}
