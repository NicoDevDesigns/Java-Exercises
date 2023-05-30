package polimorfismo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vino implements EsLiquido,ConDescuento,EsAlimento{
    private String marca;
    private String tipoVino;
    private int gradosAlcohol;
    private int precio;
    private double volumen;
    private String tipoEnvase;
    private LocalDate fechaVenc;
    private int cantCalorias;
    private double descuentoVino;

    public Vino(String marca, String tipoVino, int gradosAlcohol, int precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Es liquido
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
    //Es alimento
    public void setCaducidad(LocalDate fc){
        fechaVenc=fc;
    }
    public LocalDate getCaducidad(){
        return fechaVenc;
    }
    public int getCalorias(){
        cantCalorias=10*gradosAlcohol;
        return cantCalorias;
    }
    //Con descuento
    public void setDescuento(double des){
        descuentoVino=des;
    }

    public double getDescuento(){
        return descuentoVino;
    }

    public double getPrecioDescuento(){
        double precioFinal=precio-(precio*(descuentoVino/100));
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipoVino='" + tipoVino + '\'' +
                ", gradosAlcohol=" + gradosAlcohol +
                ", precio=" + precio +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", fechaVenc=" + fechaVenc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", cantCalorias=" + cantCalorias +
                ", descuentoVino=" + descuentoVino +
                '}';
    }
}
