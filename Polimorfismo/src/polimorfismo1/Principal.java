package polimorfismo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Detergente objDeter = new Detergente("Mongu",1000);
        objDeter.setVolumen(100);
        objDeter.setTipoEnvase("Botella de platico");
        objDeter.setDescuento(22);
        System.out.println(objDeter);
        System.out.println(objDeter.toString());

        Cereales objCer = new Cereales("Agos",300.9,"maiz");
        objCer.setCaducidad(LocalDate.of(2023,02,22));
        System.out.println("Calorias: "+objCer.getCalorias());
        System.out.println(objCer.toString());

        Vino objVino = new Vino("Ole","Sirah",20,2000);
        objVino.setCaducidad(LocalDate.of(2023,02,22));
        System.out.println(objVino.toString());

        ArrayList<EsAlimento>lista=new ArrayList<>();
        lista.add(objVino);
        lista.add(objCer);

        int totalCalorias=0;
        for(EsAlimento alimento:lista){
            totalCalorias+=alimento.getCalorias();
        }
        System.out.println("Total calorias: "+totalCalorias);

    }
}
