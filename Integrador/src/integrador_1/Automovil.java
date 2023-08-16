package integrador_1;

public class Automovil extends Terrestre implements InfoTecnica{

    public final int TANQUE_LITROS = 20;
    public final int KM_LITRO = 5;
    private boolean conAlarma = false;
    public Automovil(String comb, double distanciaAutonomia,double precio,int cantRuedas) {

        super(comb, distanciaAutonomia,precio,cantRuedas);
    }
    public String cantRuedas(){
        return "La cantidad de ruedas son: "+ getRuedas();
    }

    @Override
    public String InformacionTecnica() {
        return "Auto para uso familiar";
    }
    public String tipoAuto(Tipos tipo){
        String tipoFinal = "";
        switch (tipo){
            case DEPORTIVO:
                tipoFinal = "Auto Deportivo";
                break;
            case FAMILIAR:
                tipoFinal = "Auto familiar";
                break;
            default:
                System.err.println("Valor ingresado invalido");
        }
        return tipoFinal;
    }
    public String kilometrosTanque(){
        return "La cantidad de kilometros que puedo recorrer con un tanque es: " + TANQUE_LITROS*KM_LITRO;
    }
    public class AutomovilAnidada{
        private boolean conAlarma;
        public void cambiarAlarma(boolean alarma){
            conAlarma=alarma;
            Automovil.this.conAlarma=alarma;
        }
    }
    public void ponerAlarma(){
        AutomovilAnidada test = new AutomovilAnidada();
        test.cambiarAlarma(true);
    }
}
