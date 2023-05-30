public class ConversionTipos {
    public static void main(String[] args) {
        String numeroStr="33";
        int numeroInt=Integer.parseInt(numeroStr);
        System.out.println(numeroInt);

        String realStr="77";
        double realDouble=Double.parseDouble(realStr);
        System.out.println(realDouble);

        String logicoStr="true";
        Boolean logicoBoolean=Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int intNumero=66;
        String strNumero=Integer.toString(intNumero);
        System.out.println(strNumero);

        double numero=44.6;
        String strNumero2=String.valueOf(numero);
        System.out.println("strNumero2 = " + strNumero2);


    }
}
