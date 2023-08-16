package clases_3;

public class PrincipalVehiculo {
    public static void main(String[] args) {

        Coche chevi= new Coche(4,"rojo",100);//intanciar una clase o crear un objeto
        System.out.println(chevi.getValores());

        chevi.setRuedas(5);
        chevi.setColor("Rojo");
        System.out.println(chevi.getValores());

        Camioneta F100=new Camioneta(4,"verde",200);
        System.out.println(F100.getCapacidadCarga());
        System.out.println("las ruedas de la camioneta son: "+F100.getRuedas()+
                " el color es: "+F100.getColor());
    }
}
