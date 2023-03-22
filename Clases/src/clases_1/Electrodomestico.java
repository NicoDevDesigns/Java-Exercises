package clases_1;

public class Electrodomestico {
    //Atributos
    private String tipo;
    private String marca;
    private double potencia;
    //Constructor
    public Electrodomestico(String tipo,String marca,double potencia){
        this.marca=marca;
        this.tipo=tipo;
        this.potencia=potencia;
    }
    public Electrodomestico(String marca,double potencia){
        this.marca=marca;
        this.potencia=potencia;
    }
    public void setTipo(String nuevoTipo){
        tipo=nuevoTipo;
    }
    public String getTipo(){
        return "El tipo es: "+tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
    public double getConsumoHoras(int horas){
        double totalKw;
        totalKw=horas*potencia;
        return totalKw;
    }
    public double getConsteConsumo(int horas,double costeHora){
        double costetotal= getConsumoHoras(horas)*costeHora;
        return costetotal;
    }
}
