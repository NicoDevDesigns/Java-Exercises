import java.util.Scanner;
public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura=scanner.nextLine();

        System.out.println("Ingrese precio del primer producto: ");
        double producto1=scanner.nextDouble();
        System.out.println("Ingrese precio del segundo producto: ");
        double producto2=scanner.nextDouble();
        double montoTotalBruto=producto1+producto2;
        double impuesto=montoTotalBruto*0.19;
        double montoTotalNeto=montoTotalBruto+impuesto;

        String total="La factura tiene un monto total bruto de "+montoTotalBruto+",con un impuesto de "+impuesto+
                " el monto total neto es "+montoTotalNeto;

        System.out.println(total);

    }
}
