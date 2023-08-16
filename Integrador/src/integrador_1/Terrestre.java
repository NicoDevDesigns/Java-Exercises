package integrador_1;

public class Terrestre extends Vehiculo{

    private int ruedas;
    public Terrestre(String comb,double distanciaAutonomia,double precio,int cantRuedas){

        super(comb,distanciaAutonomia,precio);
        ruedas=cantRuedas;
    }
    public double maximaVelocidad(){
        double max=100;
        return max;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
