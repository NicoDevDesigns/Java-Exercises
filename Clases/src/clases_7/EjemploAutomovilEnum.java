public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil auto= new Automovil("ford","taunus");
        auto.setTipo(TipoAutomovil.FURGON);
        Automovil auto3= new Automovil("ford","taunus");
        auto3.setTipo(TipoAutomovil.COUPE);

        Automovil.setColorPatente(Automovil.COLOR_AMARILLO);
        Automovil.setCapacidadTangqueEstatico(300);

        System.out.println("Son iguales? " + (auto.equals(auto3)));

        auto.asignarCilindrada(150);
        System.out.println("El auto es: "+auto.leerFabricante());

        Automovil auto2 = new Automovil();
        auto2.setTipo(TipoAutomovil.SEDAN);
        auto2.asignarFabricante("chivo");
        auto2.asignarModelo("f-100");
        auto2.asignarColor(Automovil.COLOR_AZUL);
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

        System.out.println("ColorPantente= "+Automovil.getColorPatente());
        System.out.println("Consumo estatico: "+ Automovil.calcularConsumoEstatico(30,20.4f));

        TipoAutomovil tipoAuto3 = auto3.getTipo();
        System.out.println("Tipo subaru "+ tipoAuto3.getNombre());
        System.out.println("Tipo descripcion: "+tipoAuto3.getDescripcion());

        switch (tipoAuto3){
            case COUPE:
                System.out.println("El auto es deportivo");
                break;
            case FURGON:
                System.out.println("El auto es grande");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.print(ta + "=>" + ta.name()+ "," + ta.getNombre()+","+ta.getDescripcion()+","+ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
