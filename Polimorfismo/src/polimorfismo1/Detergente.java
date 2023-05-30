package polimorfismo1;

public class Detergente implements EsLiquido,ConDescuento{
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detergente(String marca, double precio){
        this.marca=marca;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setVolumen(double v){
        volumen=v;
    }

    public double getVolumen(){
        return volumen;
    }

    public void setTipoEnvase(String env){
        tipoEnvase=env;
    }

    public String getTipoEnvase(){
        return tipoEnvase;
    }

    public void setDescuento(double des){
        descuento=des;
    }

    public double getDescuento(){
        return descuento;
    }

    public double getPrecioDescuento(){
        double precioDescuento= precio - (precio*(descuento/100));
        return precioDescuento;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", descuento=" + descuento +
                ", precio con descuento= "+ getPrecioDescuento()+
                '}';
    }
}
