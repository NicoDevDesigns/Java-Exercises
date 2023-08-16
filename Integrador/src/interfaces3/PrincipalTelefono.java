package interfaces3;

public class PrincipalTelefono {
    public static void main(String[] args) {

        SamsungHijo j2Prime=new SamsungHijo(15,"j2Prime",50);

        System.out.println(j2Prime.tieneMusica("Le gusta el rock"));
        System.out.println(j2Prime.getMemoria());

    }
}
