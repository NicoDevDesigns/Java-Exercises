public class Automovil2 {
    private String fabricante;
    private String modelo;
    private String color="Azul";
    private Color color2 = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private static String colorPatente= Automovil2.COLOR_ROJO;
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

    //Contructores

    public Automovil2(){}
    public Automovil2(String fabricante, String modelo){
        this.fabricante=fabricante;
        this.modelo=modelo;
    }
    public Automovil2(String fabricante,String modelo,Motor motor,Estanque estanque){
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.motor=motor;
        this.estanque=estanque;
    }

    public Automovil2(String fabricante, String modelo, String color, Color color2, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {

        this(fabricante,modelo,motor,estanque);
        this.color = color;
        this.color2 = color2;


        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public void detalle(){

        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("Cilindrada = "+ this.motor.getCilindrada());

    }
    public static String getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(String colorPatente){
        Automovil2.colorPatente=colorPatente;
    }

    public static int getCapacidadTangqueEstatico() {
        return capacidadTangqueEstatico;
    }

    public static void setCapacidadTangqueEstatico(int capacidadTangqueEstatico) {
        Automovil2.capacidadTangqueEstatico = capacidadTangqueEstatico;
    }

    public String detalle2(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append(("\nTipo auto = " + this.getTipo().getDescripcion()));
        sb.append("\nauto.color = " + this.color);
        sb.append("\ncolorPatente = " + Automovil2.getColorPatente());

        return sb.toString();
    }

    public String detalle3(){
        String detalle = "\nAuto fabricante = "+this.leerFabricante();
        if(this.leerModelo()!=null) {
            detalle += "\nAuto modelo = " + this.leerModelo();
        }
        return detalle;
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

    public static float calcularConsumoEstatico(int km,float porcentaje){return km/(Automovil2.capacidadTangqueEstatico*porcentaje);}
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

    public float calcularConsumo(int km,float porcentaje){
        return km/(estanque.getCapacidad()*porcentaje);
    }


    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil2)){
            return false;
        }
        Automovil2 a = (Automovil2) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.leerFabricante()) && this.modelo.equals(a.leerModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }



    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
}
