public class StringExtensionArchivo {
    public static void main(String[] args) {

        String archivo= "alguna_imagen.pdf";
        int i=archivo.indexOf(".");
        int j=archivo.lastIndexOf("a");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
        System.out.println("archivo = " + archivo.substring(j));

    }
}
