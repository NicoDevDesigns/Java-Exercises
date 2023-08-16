package integrador_2.logica;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniar();
    protected abstract void atacarMordisco();

}
