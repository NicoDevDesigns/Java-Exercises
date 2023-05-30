public class StringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas="trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo=arreglo.length;
        System.out.println("largo = " + largo);
        for (int i=0;i<largo;i++){
            System.out.println("arreglo = " + arreglo[i]);
        }
        System.out.println();
        System.out.println("largo = " + trabalenguas.split("a"));

        String[] arreglo2= trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j=0;j<l;j++){
            System.out.println(arreglo2[j]);
        }

        String archivo= "alguna.imagen.pdf";
        String[] archivoArr=archivo.split("\\.");
        int a=archivoArr.length;
        System.out.println("a = " + a);
        for (int k=0;k<a;k++){
            System.out.println(archivoArr[k]);
        }
        System.out.println("extension = " + archivoArr[a-1]);
    }


}
