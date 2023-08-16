package clases_1;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String tipo,String marca,double potencia,double precio,boolean aguaCaliente){
        super(tipo, marca, potencia);
        this.precio=precio;
        this.aguaCaliente=aguaCaliente;
    }
    public Lavadora(String marca,double potencia){
        super(marca, potencia);
        aguaCaliente=false;
    }
    public Lavadora(String marca,double precio, double potencia,boolean aguaCaliente){
        super(marca, potencia);
        this.precio=precio;
        this.aguaCaliente=aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                " marca=" + getMarca()+
                " potencia=" + getPotencia()+
                " precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }
    public String getConsumoLavadora(int horas,boolean aguaCaliente){
        if(aguaCaliente==false){
            return ("El consumo en agua fria es: "+ horas*getPotencia());
        }else {
            return ("El consumo con agua caliente es: "+horas*(getPotencia()+getPotencia()*0.2));
        }
    }
}
