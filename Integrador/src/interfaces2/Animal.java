package interfaces2;

public class Animal {

    private String nombre;
    private int patas;

    public Animal(String nombre, int patas) {
        this.nombre = nombre;
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
