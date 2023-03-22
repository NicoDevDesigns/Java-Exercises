package ar.nico.clases1;

public class Coche extends Vehiculo{

    private int maxVelocidad;
    public Coche(int ruedas,String color,int maxVelocidad){
        super(ruedas, color);
        this.maxVelocidad=maxVelocidad;
    }

    public String getValores(){
        return "Las ruedas son: "+getRuedas()+
                " y el color: "+getColor();
    }

    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(int maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }
}
