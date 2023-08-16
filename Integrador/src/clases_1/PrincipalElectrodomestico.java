package clases_1;

public class PrincipalElectrodomestico {
    public static void main(String[] args) {
        Electrodomestico lavaropa = new Electrodomestico("Lavaropa","Koinor",1000);

        lavaropa.setPotencia(20);

        lavaropa.setMarca("dream");
        int horas=5;
        double consumo=lavaropa.getConsumoHoras(horas);
        double costo= lavaropa.getConsteConsumo(horas,10);

        System.out.println("Ha consumido: "+consumo+" en "+horas+"horas");
        System.out.println("debe pagar: "+costo);

        //Creamos una instancia de lavadora

        Lavadora nuevaLavadora=new Lavadora("Lavadora","Dream",100,20000,true);
        System.out.println("Los datos son: "+nuevaLavadora.toString());
        System.out.println(nuevaLavadora.getConsumoLavadora(10,true));
        System.out.println("El coste total del consumo es: " + nuevaLavadora.getConsteConsumo(20,5));

    }
}
