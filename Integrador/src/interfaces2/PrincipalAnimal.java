package interfaces2;

public class PrincipalAnimal {
    public static void main(String[] args) {

        Perro mailo=new Perro("Mailo",4,1);
        System.out.println(mailo.puedoLadrar("guau guau"));
        System.out.println(mailo.toString());
    }
}
