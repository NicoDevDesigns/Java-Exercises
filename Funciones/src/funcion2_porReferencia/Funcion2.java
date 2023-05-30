package funcion2_porReferencia;

public class Funcion2 {
    public static void main(String[] args) {
        int[] edad = {37,38,39};
        System.out.println("Se muestran los valores del arreglo");

        for(int j=0;j< edad.length;j++){
            System.out.println("Edad: "+ edad[j]);
        }
        System.out.println("Llamamos a la funcion");
        cambioDeValor(edad);
        System.out.println("Valores despues de la funcion");
        for(int j=0;j< edad.length;j++){
            System.out.println("Edad: "+ edad[j]);
        }
    }
    public static void cambioDeValor(int[]changeAge){
        System.out.println("*********Inicio de funcion*************");
        for (int k=0;k< changeAge.length;k++){
            changeAge[k]=changeAge[k]+100;
        }
        System.out.println("********Fin de funcion**********");
    }




}
