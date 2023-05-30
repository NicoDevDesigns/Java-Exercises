public class Automovil {
    private String fabricante;
    private String modelo;
    private String color="Azul";
    private Color color2 = Color.GRIS;
    private double cilindrada;
    private int capacidad=40;
    private static String colorPatente=Automovil.COLOR_ROJO;
    private static int capacidadTangqueEstatico=100;
    private int id;
    private static int ultimoId;
    private TipoAutomovil tipo;
    public static final int VELOCIDAD_MAX = 120;
    public static final int VELOCIDAD_CARRETERA = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS= "Gris";

    /*public Automovil(){
        this.id = ++ultimoId;
    }*/

    public Automovil(){}
    public Automovil(String fabricante,String modelo){
        this.fabricante=fabricante;
        this.modelo=modelo;
    }

    public void detalle(){

        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);

    }
    public static String getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente=colorPatente;
    }

    public static int getCapacidadTangqueEstatico() {
        return capacidadTangqueEstatico;
    }

    public static void setCapacidadTangqueEstatico(int capacidadTangqueEstatico) {
        Automovil.capacidadTangqueEstatico = capacidadTangqueEstatico;
    }

    public String detalle2(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append(("\nTipo auto = " + this.getTipo().getDescripcion()));
        sb.append("\nauto.color = " + this.color);
        sb.append("\ncolorPatente = " + Automovil.getColorPatente());
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto "+this.fabricante+" acelera a "+rpm+" rpm";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }
    public String acelerarFrenar(int rpm){
        String acelerar= this.acelerar(rpm);
        String frenar= this.frenar();
        return acelerar+"\n"+frenar;
    }
    public float calcularConsumo(int km,float porcentaje){
        return km/(capacidad*porcentaje);
    }
    public float calcularConsumo(int km,int porcentaje){
        return km/(capacidad*(porcentaje/100f));
    }
    public static float calcularConsumoEstatico(int km,float porcentaje){return km/(Automovil.capacidadTangqueEstatico*porcentaje);}
    public String leerFabricante(){
        return this.fabricante;
    }
    public void asignarFabricante(String fabricante){
        this.fabricante=fabricante;
    }
    public String leerModelo(){
        return this.modelo;
    }
    public void asignarModelo(String modelo){
        this.modelo=modelo;
    }
    public String leerColor(){
        return this.color;
    }
    public void asignarColor(String color){
        this.color=color;
    }
    public double leerCilindrada(){
        return this.cilindrada;
    }
    public void asignarCilindrada(double cilindrada){
        this.cilindrada=cilindrada;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.leerFabricante()) && this.modelo.equals(a.leerModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidad=" + capacidad +
                '}';
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
}
