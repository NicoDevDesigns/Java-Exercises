public class EjemploString2 {
    public static void main(String[] args) {
        String nombre="Nico";
        String mundo=" te saluda el mundo ";

        String detalle=nombre+mundo+"Buen dia";
        System.out.println(detalle);

        int numA=66;
        int numB=100;

        System.out.println(detalle+" "+(numA+numB));
        
        String detalle2=nombre.concat(mundo);
        System.out.println("detalle2 = " + detalle2);
        String detalle3=nombre.concat("wii".concat(mundo));
        System.out.println("detalle3 = " + detalle3);


    }
}
