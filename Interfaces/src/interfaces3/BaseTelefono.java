package interfaces3;

public class BaseTelefono {
    private int alto;
    private String marca;

    public BaseTelefono(int alto,String marca){
        this.alto=alto;
        this.marca=marca;
    }
    public int getAlto(){
        return alto;
    }
    public void setAlto(int nuevoalto){
        alto=nuevoalto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}