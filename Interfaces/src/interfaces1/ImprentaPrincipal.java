package interfaces1;

public class ImprentaPrincipal {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Nico","Sanchez"),"Ingeniro","Resumen: ");
        cv.addExperiencia("Java");
        cv.addExperiencia("Python");
        cv.addExperiencia("html");
        cv.addExperiencia("css");
        cv.addExperiencia("javascript");

        Libro libro = new Libro(new Persona("nico", "sanchez"),"mas alla del codigo",Genero.PROGRAMACION);
        libro.addPagina(new Paginas("patron Singleton"))
                .addPagina(new Paginas("patron observador"));

        Informe informe = new Informe(new Persona("Leo","sanchez"),"Microservicios","Fabian");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }
public static void imprimir(Imprimible imprimible){
    System.out.println(imprimible.imprimir());
}
}
