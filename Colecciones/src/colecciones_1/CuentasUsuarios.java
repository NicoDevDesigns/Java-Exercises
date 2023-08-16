package colecciones_1;
import java.util.Set;
import java.util.HashSet;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Nico","001",10000);
        Cliente cliente2 = new Cliente("Leo","002",50000);
        Cliente cliente3 = new Cliente("Dante","003",5000);

        Set <Cliente> clientesBanco=new HashSet<Cliente>();
        clientesBanco.add(cliente1);
        clientesBanco.add(cliente2);
        clientesBanco.add(cliente3);

        for(Cliente cliente : clientesBanco){
            System.out.println(cliente.getNombre()+" "+
                    cliente.getN_cuenta()+" "+cliente.getSaldo());
        }
    }

}
