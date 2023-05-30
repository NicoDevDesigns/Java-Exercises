package polimorfismo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento{
    private String marca;
    private Double precio;
    private String tipoCereal;
    private LocalDate fechaVenc;
    private int cantCalorias;

    public Cereales(String marca, Double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public void setCaducidad(LocalDate fc){
        fechaVenc=fc;
    }
    public LocalDate getCaducidad(){
        return fechaVenc;
    }

    public int getCalorias(){
        if(tipoCereal.equalsIgnoreCase("espelta")){
            return 5;
        } else if (tipoCereal.equalsIgnoreCase("maiz")) {
            return 8;
        }else if(tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        }else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", fechaVenc=" + fechaVenc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", cantCalorias=" + cantCalorias +
                '}';
    }
}
