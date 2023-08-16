package interfaces1;

public class Informe extends Hoja implements Imprimible{

    private Persona autor;
    private Persona inspector;
    public Informe(Persona autor,Persona inspector, String contenido) {
        super(contenido);
        this.autor=autor;
        this.inspector=inspector;
    }

    @Override
    public String imprimir() {
        return "Autor: "+autor+"inspector: "+inspector+"\n"+this.contenido;
    }
}
