public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto= new Automovil("ford","taunus");
        Automovil auto3= new Automovil("ford","taunus");

        System.out.println("Son iguales? " + (auto.equals(auto3)));

        auto.asignarCilindrada(150);
        System.out.println("El auto es: "+auto.leerFabricante());

        Automovil auto2 = new Automovil();
        auto2.asignarFabricante("chivo");
        auto2.asignarModelo("f-100");
        auto2.asignarColor("Rojo");
        auto2.asignarCilindrada(200);
        System.out.println("El auto2 es: "+auto2.leerModelo());

        auto.detalle();
        System.out.println();
        auto2.detalle();
        System.out.println();

        System.out.println(auto.detalle2());
        System.out.println(auto2.detalle2());
        System.out.println(auto.acelerar(1000));
        System.out.println(auto2.frenar());
        System.out.println(auto.acelerarFrenar(2000));
        System.out.println("Kilometros por litro: " + auto.calcularConsumo(100,0.7f));
        System.out.println("kilometros por litro: "+ auto2.calcularConsumo(200,30));

        System.out.println();
        System.out.println("ToString:!!!!!!!!!!!!!"+auto);


    }

}
