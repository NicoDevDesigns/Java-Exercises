package ar.nico.clases1;

public class Vehiculo {
    private int ruedas;
    private String color;

    public Vehiculo(int ruedas,String color){
        this.ruedas=ruedas;
        this.color=color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
