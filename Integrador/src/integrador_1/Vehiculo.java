package integrador_1;

public class Vehiculo {
    private String combustible;
    private double autonomia;
    private double precio;

    public Vehiculo(String nuevoCombustible,double kmAutonomia,double precio){
        autonomia=kmAutonomia;
        combustible=nuevoCombustible;
        this.precio=precio;
    }
    public double consumoDeCombustible(){
        double total= 100;
        return total;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
