package integrador_2.logica;

public class Squirle extends Pokemon implements IAgua{

    public Squirle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque placaje");
    }

    @Override
    protected void atacarAraniar() {
        System.out.println("Ataque Araniar");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("ataque pistola de agua");
    }
}
