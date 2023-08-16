package clases_3;

public class Camioneta extends Vehiculo{

    private int capacidadCarga;

    public Camioneta(int ruedas,String color,int capCarga){
        super(ruedas, color);
        capacidadCarga=capCarga;
    }
    public void setCapacidadCarga(int nuevaCapacidad){
        capacidadCarga=nuevaCapacidad;
    }
    public String getCapacidadCarga(){
        return "La capacidad de carga es: "+capacidadCarga;
    }

}
