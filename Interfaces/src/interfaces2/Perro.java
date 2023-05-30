package interfaces2;

public class Perro extends Animal implements Ladrar{

    private int numCola;

    public Perro(String nombre, int patas, int numCola) {
        super(nombre, patas);
        this.numCola = numCola;
    }

    public int getNumCola() {
        return numCola;
    }

    public void setNumCola(int numCola) {
        this.numCola = numCola;
    }

    public String puedoLadrar(String ladrar) {
        return "Mi ladrido es: "+ladrar;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Nombre: "+getNombre()+
                "Numero de patas: "+getPatas()+
                "numCola=" + numCola +
                '}';
    }
}
