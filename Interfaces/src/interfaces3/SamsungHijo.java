package interfaces3;

public class SamsungHijo extends BaseTelefono implements SuenaMusica{

    private int memoria;

    public SamsungHijo(int alto1,String marca1,int memoria){
        super(alto1,marca1);
        this.memoria=memoria;
    }
    public void setMemoria(int nuevaMemoria){
        memoria=nuevaMemoria;
    }
    public int getMemoria(){
        return memoria;
    }
    public String tieneMusica(String tipoMusica){
        return "El tipo de musica que escucha es: "+tipoMusica;
    }

}
