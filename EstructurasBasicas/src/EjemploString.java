public class EjemploString {
    public static void main(String[] args) {
        String curso="Programacion Java";
        String curso2=new String("Programacion Java");

        Boolean esIgual=curso==curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual=curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

    }
}
