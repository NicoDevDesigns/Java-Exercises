package claseAbstracta_1.form.elementos;

abstract public class ElementForm {

    protected String valor;
    protected String nombre;

    public ElementForm() {
    }

    public ElementForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();
}
